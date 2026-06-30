package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class td implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv3 f228987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ud f228989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228990h;

    public td(android.view.View view, r45.xv3 xv3Var, r45.wv3 wv3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ud udVar, android.view.View view2) {
        this.f228986d = view;
        this.f228987e = xv3Var;
        this.f228988f = wv3Var;
        this.f228989g = udVar;
        this.f228990h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        r45.xv3 xv3Var;
        android.view.View view = this.f228986d;
        int height = (int) (((view != null ? view.getHeight() : 0) / 1200.0f) * (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f228987e.f472027x) ^ true ? 50 : 48));
        gb3.k kVar = (gb3.k) i95.n0.c(gb3.k.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ud udVar = this.f228989g;
        android.view.View mo144222x4ff8c0f0 = udVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.uee);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b O6 = udVar.O6();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = udVar.f229032d;
        int width = this.f228990h.getWidth();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z2) kVar).getClass();
        if (mo144222x4ff8c0f0 == null || O6 == null || view == null) {
            return;
        }
        r45.wv3 wv3Var = this.f228988f;
        java.lang.String str = (wv3Var == null || (xv3Var = wv3Var.f471034g) == null) ? null : xv3Var.M;
        if (str == null || str.length() == 0) {
            return;
        }
        if (width == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] viewWidth == 0, fix it");
            width = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de);
        }
        float f18 = width * 1.62f;
        int round = java.lang.Math.round(f18);
        int round2 = java.lang.Math.round(f18 * 1.2578f);
        android.view.ViewGroup.LayoutParams layoutParams = mo144222x4ff8c0f0.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = round;
            layoutParams.height = round2;
            mo144222x4ff8c0f0.setLayoutParams(layoutParams);
        }
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        if (round2 != 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            f17 = ((iArr[1] + view.getHeight()) - round2) - height;
        } else {
            f17 = 0.0f;
        }
        if (f17 == 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] atmosphereDynamicCoverY == 0, fix it");
            f17 = ((com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278669b * 0.5f) + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0)) - round2;
        }
        mo144222x4ff8c0f0.setY(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.b(wv3Var, 13, y0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.y2(java.lang.System.currentTimeMillis(), mo144222x4ff8c0f0, 13, O6));
    }
}
