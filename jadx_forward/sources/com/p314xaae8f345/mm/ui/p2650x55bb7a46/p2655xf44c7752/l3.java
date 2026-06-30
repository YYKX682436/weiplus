package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class l3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.y0 {

    /* renamed from: l, reason: collision with root package name */
    public long f282705l;

    /* renamed from: m, reason: collision with root package name */
    public final int f282706m;

    public l3() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f282705l = currentTimeMillis;
        this.f282706m = (int) (currentTimeMillis / 1000);
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var == null || !f9Var.M2()) {
            return;
        }
        b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.r(f9Var), i17, this.f282706m, 101);
    }

    public final void d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b ui6, int i17, int i18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17;
        ot0.m1 r17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        int i19 = this.f282706m;
        if (i17 > 0 && (y17 = ui6.f282144g.y(i17)) != null && y17.M2() && (r17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.r(y17)) != null) {
            this.f267371d = (int) (java.lang.System.currentTimeMillis() - this.f282705l);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = ui6.f282144g;
            this.f267370c = (k1Var == null || (j1Var = k1Var.f282631p) == null || (k17 = j1Var.k(i17)) == null || (f4Var = k17.f282971p) == null) ? 0 : f4Var.mo69307x9746038c();
            b(r17, 2, i19, 101);
        }
        if (i18 > 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l3 l3Var = ui6.f282209y;
            if (i17 > 0) {
                l3Var.f267376i = 0;
            } else {
                l3Var.f267376i = 1;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 y18 = ui6.f282144g.y(i18);
            if (y18 == null || !y18.M2()) {
                return;
            }
            this.f282705l = java.lang.System.currentTimeMillis();
            this.f267373f = ui6.getIntent().getIntExtra("KOpenArticleSceneFromScene", 1);
            this.f267374g = 10000;
            ot0.m1 r18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.r(y18);
            if (r18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryMpVideoReport", "report17537 mpShareVideoInfo is null");
            } else {
                this.f267375h = c01.e2.J(r18.f454881p);
                b(r18, 1, i19, 101);
            }
        }
    }
}
