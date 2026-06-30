package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class sa implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282904d;

    public sa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        this.f282904d = taVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282904d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = taVar.f282957b;
        k1Var.f282625g.f282209y.c(k1Var.w(), 7);
        taVar.f282957b.f282625g.f282209y.f267376i = 4;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qa(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryViewHolder", "play video error what : " + i17 + " extra: " + i18);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282904d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = taVar.f282957b;
        if (k1Var != null) {
            k1Var.f282631p.v(i17, i18);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l3 l3Var = taVar.f282957b.f282625g.f282209y;
        l3Var.f267376i = 4;
        l3Var.f267372e = "what : " + i17 + " extra: " + i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12084, java.lang.Integer.valueOf(taVar.H), java.lang.Integer.valueOf(taVar.G * 1000), 0, 4, taVar.f282955J, java.lang.Integer.valueOf(taVar.I), taVar.L, java.lang.Long.valueOf(taVar.K));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9757x58d5b73c() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa.mo9757x58d5b73c():void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282904d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryViewHolder", "dkvideo onplaytime:%d total:%d,%d size:%d cnt:%d user:%s", valueOf, java.lang.Integer.valueOf(taVar.G), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(taVar.H), java.lang.Integer.valueOf(taVar.I), taVar.f282955J);
        gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ra(this, i18, i17));
        return 0;
    }
}
