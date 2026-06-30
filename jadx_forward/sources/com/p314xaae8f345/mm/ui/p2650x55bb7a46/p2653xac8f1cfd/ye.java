package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class ye implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f281845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe f281846e;

    public ye(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar, android.widget.LinearLayout linearLayout) {
        this.f281846e = peVar;
        this.f281845d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = this.f281846e;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pg) ((sb5.b1) peVar.f280113d.f542241c.a(sb5.b1.class))).f281243e) {
            sb5.b1 b1Var = (sb5.b1) peVar.f280113d.f542241c.a(sb5.b1.class);
            int i17 = peVar.f281221i;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pg pgVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pg) b1Var;
            if (pgVar.f281244f != null) {
                java.lang.String string = pgVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.af7);
                java.lang.String l17 = c01.z1.l();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String format = java.lang.String.format(string, l17);
                r35.e4 e4Var = new r35.e4(pgVar.f280113d.g(), null);
                e4Var.f450627q = format;
                e4Var.g(java.util.Arrays.asList(pgVar.f281246h), java.util.Arrays.asList(18));
                pgVar.f281245g = true;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.t8 D0 = r21.w.Bi().D0(pgVar.f281246h, 1);
                c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(3, pgVar.f281246h, D0.f66519x11bb99f1, i17));
                D0.f66509x225ba391 = 2;
                r21.w.Bi().mo9952xce0038c9(D0, new java.lang.String[0]);
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) pgVar.f280113d.f542241c.a(sb5.z0.class))).n0();
        } else {
            if (((int) peVar.f280113d.u().E2) == 0 && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(peVar.f280113d.u()) != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.HeaderComponent", "[insertRetId] successfully! username:%s", peVar.f280113d.u());
            }
            java.lang.String str2 = "";
            java.lang.String d17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(peVar.f280113d.u().d1()) ? peVar.f280113d.u().d1() : "";
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(peVar.f281220h, true);
            if (n17 != null && (str = n17.F1) != null) {
                str2 = str;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.HeaderComponent", "dkverify banner add:%s chat:%s ticket", peVar.f281220h, d17, str2);
            if ((android.text.TextUtils.isEmpty(d17) || !android.text.TextUtils.isEmpty(str2)) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(n17.d1())) {
                r35.a aVar = new r35.a(peVar.f280113d.g(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ve(this));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(3);
                aVar.m(str2);
                aVar.f450558z = true;
                aVar.a(peVar.f281220h, d17, linkedList);
            } else {
                ((c01.k7) c01.n8.a()).g(peVar.f281220h, d17, 31, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xe(this, d17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11004, peVar.f281220h, 3);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
