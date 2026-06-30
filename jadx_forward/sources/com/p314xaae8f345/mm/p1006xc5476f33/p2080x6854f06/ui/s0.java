package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class s0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 f243864d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 activityC17679x4e14a258) {
        this.f243864d = activityC17679x4e14a258;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = (com.p314xaae8f345.mm.p2621x8fb0427b.pa) this.f243864d.f243746e.getItem(i17);
        if (paVar == null || (str = paVar.f66538xad49e234) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", f17.f275392a);
        intent.putExtra("Contact_Encryptusername", f17.f275415x);
        intent.putExtra("Contact_Alias", f17.f275393b);
        intent.putExtra("Contact_Nick", f17.f275394c);
        intent.putExtra("Contact_QuanPin", f17.f275395d);
        intent.putExtra("Contact_PyInitial", f17.f275396e);
        intent.putExtra("Contact_Sex", f17.f275406o);
        intent.putExtra("Contact_Signature", f17.f275407p);
        intent.putExtra("Contact_Scene", f17.f275399h);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_City", f17.a());
        intent.putExtra("Contact_Province", f17.d());
        intent.putExtra("Contact_Content", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(paVar.f66542x7236dff2) ? this.f243864d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572393b26) : paVar.f66542x7236dff2);
        intent.putExtra("Contact_verify_Scene", f17.f275399h);
        intent.putExtra("Contact_Uin", f17.f275402k);
        intent.putExtra("Contact_QQNick", f17.f275403l);
        intent.putExtra("Contact_Mobile_MD5", f17.f275400i);
        intent.putExtra("User_From_Fmessage", true);
        intent.putExtra("Contact_from_msgType", 37);
        intent.putExtra("Verify_ticket", f17.f275411t);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("Contact_Source_FMessage", f17.f275399h);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(f17.f275392a, true);
        if (n17 != null && ((int) n17.E2) >= 0 && !n17.r2()) {
            int i18 = f17.f275414w;
            if (i18 == 0 || i18 == 2 || i18 == 5) {
                intent.putExtra("User_Verify", true);
            }
            intent.putExtra("Contact_IsLBSFriend", true);
            intent.putExtra("Sns_from_Scene", 18);
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 31);
        intent.putExtra("CONTACT_INFO_UI_SUB_SOURCE", this.f243864d.getIntent().getBooleanExtra("IntentNewSayHiMsg", false) ? 3101 : 3103);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this.f243864d);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505();
        c6868x3446b505.f141861h = i17 + 1;
        c6868x3446b505.f141859f = c6868x3446b505.b("ToUsername", f17.f275392a, true);
        c6868x3446b505.f141864k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f275407p) ? 1L : 2L;
        c6868x3446b505.f141862i = f17.f275406o;
        ku5.u0 u0Var = ku5.t0.f394148d;
        y24.a aVar = new y24.a(c6868x3446b505, 151);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
