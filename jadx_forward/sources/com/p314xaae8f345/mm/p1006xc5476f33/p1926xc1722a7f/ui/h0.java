package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class h0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233675d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a) {
        this.f233675d = activityC16724xf2604f0a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = this.f233675d;
        int i18 = activityC16724xf2604f0a.f233633t <= 0 ? i17 : i17 - 1;
        if (m25.a.c() && activityC16724xf2604f0a.f233637x != null) {
            i18--;
        }
        if (activityC16724xf2604f0a.f233632s) {
            i18--;
        }
        if (i18 < 0 || i18 >= ((java.util.LinkedList) activityC16724xf2604f0a.f233626m).size()) {
            yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) activityC16724xf2604f0a.f233626m).get(i18);
        if (b64Var.f452089m == 10000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0) ((java.util.HashMap) activityC16724xf2604f0a.f233627n).get(b64Var.f452083d);
            l0Var.f233707l |= 1;
            int i19 = l0Var.f233703h;
            if (i19 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                c12559xbdae8559.f169323f = 1134;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(this.f233675d, l0Var.f233704i, "", 0, 0, "", c12559xbdae8559);
            } else if (i19 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", l0Var.f233704i);
                intent.putExtra("geta8key_scene", 25);
                intent.putExtra("stastic_scene", 12);
                j45.l.j(activityC16724xf2604f0a.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str = b64Var.f452083d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17.r2()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", 18);
            intent2.putExtra("Sns_from_Scene", 18);
            intent2.putExtra("lbs_ticket", b64Var.C);
            intent2.putExtra("Contact_IsLbsGotoChatting", true);
            if (str != null && str.length() > 0) {
                if (n17.k2()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, str.concat(",18"));
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
                am.au auVar = c6005x8a110b2f.f136299g;
                auVar.f87720a = intent2;
                auVar.f87721b = str;
                c6005x8a110b2f.e();
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent2, activityC16724xf2604f0a);
            }
        } else {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", b64Var.f452083d);
            intent3.putExtra("Contact_Alias", b64Var.f452094r);
            intent3.putExtra("Contact_Nick", b64Var.f452084e);
            intent3.putExtra("Contact_Distance", b64Var.f452088i);
            intent3.putExtra("Contact_Signature", b64Var.f452087h);
            intent3.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(b64Var.f452100x, b64Var.f452085f, b64Var.f452086g));
            intent3.putExtra("Contact_Sex", b64Var.f452089m);
            intent3.putExtra("Contact_IsLBSFriend", true);
            intent3.putExtra("Contact_Scene", 18);
            intent3.putExtra("Contact_VUser_Info", b64Var.f452092p);
            intent3.putExtra("Contact_VUser_Info_Flag", b64Var.f452091o);
            intent3.putExtra("Contact_KWeibo_flag", b64Var.f452097u);
            intent3.putExtra("Contact_KWeibo", b64Var.f452095s);
            intent3.putExtra("Contact_KWeiboNick", b64Var.f452096t);
            intent3.putExtra("Contact_KSnsIFlag", b64Var.f452099w.f452961d);
            intent3.putExtra("Contact_KSnsBgId", b64Var.f452099w.f452963f);
            intent3.putExtra("Contact_KSnsBgUrl", b64Var.f452099w.f452962e);
            intent3.putExtra("lbs_ticket", b64Var.C);
            intent3.putExtra("Contact_IsLbsGotoChatting", true);
            if (b64Var.A != null) {
                dm.h1 h1Var = new dm.h1();
                h1Var.f66736x6bad7fc0 = b64Var.A;
                r45.va0 va0Var = b64Var.B;
                h1Var.f66733x6baace8e = va0Var.f469554d;
                h1Var.f66734xea1bd3d4 = va0Var.f469557g;
                h1Var.f66740x26b3182a = va0Var.f469555e;
                h1Var.f66735x6bac33d0 = va0Var.f469556f;
                intent3.putExtra("KBrandInfo_item", new com.p314xaae8f345.mm.p647x5a0af82.C10323xd08533e8(h1Var));
            }
            intent3.putExtra("Sns_from_Scene", 18);
            intent3.putExtra("CONTACT_INFO_UI_SOURCE", 5);
            intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent3, activityC16724xf2604f0a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
