package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class j1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff f233685d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff) {
        this.f233685d = activityC16726x80180cff;
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
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff = this.f233685d;
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t8) activityC16726x80180cff.f233644e.getItem(activityC16726x80180cff.f233645f.getHeaderViewsCount() > 0 ? i17 - activityC16726x80180cff.f233645f.getHeaderViewsCount() : i17);
        if (t8Var == null || (str = t8Var.f66507xad49e234) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str);
        android.content.Intent intent = new android.content.Intent();
        if (m25.a.c()) {
            intent.putExtra("Chat_User", t8Var.f66513xe76baaa9);
            intent.putExtra("lbs_mode", true);
            intent.putExtra("add_scene", 18);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, activityC16726x80180cff);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
            intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", activityC16726x80180cff.f233653q ? 503 : 502);
            intent2.putExtra("Contact_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f275392a) ? t8Var.f66514x49f69af2 : f17.f275392a);
            intent2.putExtra("Contact_Alias", f17.f275393b);
            intent2.putExtra("Contact_Nick", f17.f275394c);
            intent2.putExtra("Contact_QuanPin", f17.f275395d);
            intent2.putExtra("Contact_PyInitial", f17.f275396e);
            intent2.putExtra("Contact_Sex", f17.f275406o);
            intent2.putExtra("Contact_Signature", f17.f275407p);
            intent2.putExtra("Contact_Scene", f17.f275399h);
            intent2.putExtra("Contact_FMessageCard", true);
            intent2.putExtra("Contact_City", f17.a());
            intent2.putExtra("Contact_Province", f17.d());
            intent2.putExtra("Contact_Content", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t8Var.f66512x7236dff2) ? activityC16726x80180cff.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572393b26) : t8Var.f66512x7236dff2);
            intent2.putExtra("Contact_verify_Scene", f17.f275399h);
            intent2.putExtra("Contact_Uin", f17.f275402k);
            intent2.putExtra("Contact_QQNick", f17.f275403l);
            intent2.putExtra("Contact_Mobile_MD5", f17.f275400i);
            intent2.putExtra("User_From_Fmessage", true);
            intent2.putExtra("Contact_from_msgType", 37);
            intent2.putExtra("Verify_ticket", f17.f275411t);
            intent2.putExtra("Contact_Source_FMessage", f17.f275399h);
            intent2.putExtra("Contact_ShowFMessageList", true);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f17.f275392a, true);
            if (n17 != null && ((int) n17.E2) >= 0 && !n17.r2()) {
                int i18 = f17.f275414w;
                if (i18 == 0 || i18 == 2 || i18 == 5) {
                    intent2.putExtra("User_Verify", true);
                }
                intent2.putExtra("Contact_IsLBSFriend", true);
                intent2.putExtra("Sns_from_Scene", 18);
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent2, activityC16726x80180cff);
            ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
            int i19 = f17.f275406o;
            ((wo2.k) gVar).getClass();
            rq2.u.c(rq2.u.f480422a, null, null, null, null, 0L, 6L, 0L, 0L, 0L, 0L, i17 + 1, i19, 0L, 5087, null);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5155xc294fa24 c5155xc294fa24 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5155xc294fa24();
        c5155xc294fa24.f135504g.getClass();
        c5155xc294fa24.e();
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
