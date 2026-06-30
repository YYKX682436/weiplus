package gt4;

/* loaded from: classes9.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f356979d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f356979d = c19151x10374577;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        a36.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577 = this.f356979d;
        a36.c cVar = c19151x10374577.f262274p;
        if (cVar != null && (aVar = cVar.f82641h) != null) {
            c19151x10374577.f262283y = aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, type: %s", java.lang.Integer.valueOf(aVar.f82626f));
            a36.a aVar2 = c19151x10374577.f262283y;
            int i17 = aVar2.f82626f;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", java.lang.Integer.valueOf(i17), c19151x10374577.f262283y.f82627g);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(c19151x10374577.f262277s, c19151x10374577.f262283y.f82627g, false);
                c19151x10374577.f262279u = true;
                c19151x10374577.f262282x = true;
                c19151x10374577.A = false;
                c19151x10374577.f262284z.mo50297x7c4d7ca2(new gt4.f2(this), 3000L);
            } else if (i17 == 2) {
                a36.g gVar = aVar2.f82628h;
                if (gVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, jump tiny app, userName: %s, path: %s, version: %s", gVar.f82675d, gVar.f82676e, java.lang.Integer.valueOf(gVar.f82677f));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                    java.lang.String str = gVar.f82675d;
                    am.nx nxVar = c6113xa3727625.f136390g;
                    nxVar.f88999a = str;
                    java.lang.String str2 = gVar.f82676e;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    nxVar.f89000b = str2;
                    nxVar.f89002d = ad1.d.f23x366c91de;
                    nxVar.f89003e = c19151x10374577.f262276r;
                    nxVar.f89001c = 0;
                    int i18 = gVar.f82677f;
                    if (i18 > 0) {
                        nxVar.f89007i = i18;
                    }
                    nxVar.f89004f = c19151x10374577.f262277s;
                    c6113xa3727625.e();
                    c19151x10374577.f262279u = true;
                    c19151x10374577.A = false;
                    c19151x10374577.f262284z.mo50297x7c4d7ca2(new gt4.g2(this), 3000L);
                }
                c19151x10374577.f262282x = true;
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do get lottery");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.a(c19151x10374577);
                c19151x10374577.f262282x = true;
            } else if (i17 == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do nothing");
            } else if (i17 == 6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, show layer");
                c19151x10374577.f262282x = true;
            } else if (i17 == 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, draw lottery");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.b(c19151x10374577, 3, true);
                c19151x10374577.f262282x = true;
            } else if (i17 == 8) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.a(c19151x10374577);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", java.lang.Integer.valueOf(c19151x10374577.f262283y.f82626f), c19151x10374577.f262283y.f82627g);
                c19151x10374577.f262282x = true;
            } else if (i17 == 9) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.a(c19151x10374577);
                c19151x10374577.f262282x = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 2;
            objArr[1] = java.lang.Integer.valueOf(c19151x10374577.f262279u ? 2 : 1);
            g0Var.d(15225, objArr);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
