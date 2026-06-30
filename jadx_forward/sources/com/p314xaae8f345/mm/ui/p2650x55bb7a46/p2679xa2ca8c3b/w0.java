package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 f287428d;

    public w0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var) {
        this.f287428d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var = this.f287428d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = i1Var.f285689z;
        java.lang.String str = i5Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var).f156580d : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        int d07 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1.d0(i1Var, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q) view.getTag(com.p314xaae8f345.mm.R.id.bhl)).mo79416xf806b362());
        tt0.a a17 = tt0.a.a(erVar.c().j());
        java.lang.String str2 = a17.f503312e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = a17.f503310c;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = a17.f503316i;
        java.lang.String str7 = str6 == null ? "" : str6;
        java.lang.String str8 = a17.f503311d;
        if (str8 == null) {
            str8 = "";
        }
        int i17 = a17.f503314g;
        int i18 = a17.f503313f;
        java.lang.String str9 = a17.f503308a;
        java.lang.String replaceAll = (str9 != null ? str9 : "").replaceAll("[_a-zA-Z0-9]", "*");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) container click", str8);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = str8;
        b1Var.f398549c = i18;
        b1Var.f398551d = i17;
        b1Var.f398555f = str7;
        b1Var.f398567l = "1162:" + str5 + ":" + replaceAll;
        b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5.f34505x366c91de;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11810xcb772e0b c11810xcb772e0b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11810xcb772e0b();
        c11810xcb772e0b.f158847d = str3;
        c11810xcb772e0b.f158848e = i1Var.f285682s;
        c11810xcb772e0b.f158849f = 2;
        c11810xcb772e0b.f158850g = str5;
        c11810xcb772e0b.f158851h = replaceAll;
        c11810xcb772e0b.f158852i = d07;
        c11810xcb772e0b.f158853m = str;
        b1Var.A = c11810xcb772e0b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(i1Var.f285683t.g(), b1Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s2 s2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s2) ((sb5.o) i1Var.f285683t.f542241c.a(sb5.o.class));
        if (s2Var.n0()) {
            ((java.util.HashSet) s2Var.f281434m).add(java.lang.Integer.valueOf(java.lang.Math.max(0, d07)));
        }
        this.f287428d.e0(4, str3, str5, str7, null, d07);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
