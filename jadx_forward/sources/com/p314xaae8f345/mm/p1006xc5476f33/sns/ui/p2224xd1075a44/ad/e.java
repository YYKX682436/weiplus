package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* loaded from: classes3.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 f252522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f252523b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f252522a = v0Var;
        this.f252523b = c17933xe8d1b226;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17933xe8d1b226 != null ? c17933xe8d1b226.m70367x7525eefd() : null, c17933xe8d1b2262 != null ? c17933xe8d1b2262.m70367x7525eefd() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var = this.f252522a;
        if (b17) {
            if (v0Var.D() != null && v0Var.C() != null && v0Var.M() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                float q17 = i65.a.q(v0Var.f252584p);
                if (v0Var.H() <= 0) {
                    android.widget.TextView C = v0Var.C();
                    int measuredHeight = C != null ? C.getMeasuredHeight() : -2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f252586r = measuredHeight;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                if (v0Var.I() <= 0) {
                    android.widget.TextView D = v0Var.D();
                    int measuredHeight2 = D != null ? D.getMeasuredHeight() : -2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f252585q = measuredHeight2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                if (v0Var.H() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(v0Var.j(), "get a error config!");
                    android.widget.TextView M = v0Var.M();
                    int measuredHeight3 = M != null ? M.getMeasuredHeight() : -2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f252586r = measuredHeight3;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.j(), "measureDescHeight = " + v0Var.H() + "  measureTitleHeight = " + v0Var.I());
                if (v0Var.H() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(v0Var.j(), "a error measureDescHeight!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f252586r = -2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                if (v0Var.I() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(v0Var.j(), "a error measureTitleHeight!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f252585q = -2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                android.widget.TextView D2 = v0Var.D();
                android.view.ViewGroup.LayoutParams layoutParams = D2 != null ? D2.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = v0Var.I();
                }
                android.widget.TextView C2 = v0Var.C();
                android.view.ViewGroup.LayoutParams layoutParams2 = C2 != null ? C2.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.height = v0Var.H();
                }
                android.widget.TextView M2 = v0Var.M();
                android.view.ViewGroup.LayoutParams layoutParams3 = M2 != null ? M2.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.height = v0Var.H();
                }
                android.widget.TextView D3 = v0Var.D();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(D3);
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(D3, 1, (int) (v0Var.E(14) * q17), 1, 0);
                android.widget.TextView C3 = v0Var.C();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(C3);
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(C3, 1, (int) (v0Var.E(13) * q17), 1, 0);
                android.widget.TextView M3 = v0Var.M();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M3);
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(M3, 1, (int) (q17 * v0Var.E(13)), 1, 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2140x2dc211.C17786xcc30e6b6 G = v0Var.G();
            if (G != null) {
                G.a(0.0f, 0.0f, v0Var.E(0), v0Var.E(6), v0Var.E(0), v0Var.E(8), v0Var.E(0), v0Var.E(6));
            }
            java.lang.String j17 = v0Var.j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try processAnim! ");
            sb6.append(v0Var.K());
            sb6.append(' ');
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f252523b;
            sb6.append(c17933xe8d1b2263 != null ? c17933xe8d1b2263.m70367x7525eefd() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
            int K = v0Var.K();
            if (K == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0.y(v0Var);
            } else if (K == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0.A(v0Var);
            } else if (K == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0.z(v0Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(v0Var.j(), "multiView on predraw snsId is not equals!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
    }
}
