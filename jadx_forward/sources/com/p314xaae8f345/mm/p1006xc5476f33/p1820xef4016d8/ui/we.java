package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class we implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f229182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f229183e;

    public we(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def, r45.wv3 wv3Var) {
        this.f229182d = activityC16377xf00b6def;
        this.f229183e = wv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f229182d;
        activityC16377xf00b6def.K = activityC16377xf00b6def.f227845v != null ? r1.getWidth() : 0;
        float height = (activityC16377xf00b6def.f227853z != null ? r1.getHeight() : 0) / 1200.0f;
        r45.xv3 xv3Var = this.f229183e.f471034g;
        int i17 = (int) (height * (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var != null ? xv3Var.f472027x : null) ^ true ? 50 : 48));
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        r45.wv3 wv3Var = this.f229183e;
        android.view.View view = activityC16377xf00b6def.L;
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = activityC16377xf00b6def.M;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = activityC16377xf00b6def.H;
        android.view.View view2 = activityC16377xf00b6def.f227845v;
        activityC16377xf00b6def.f227829J = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar).rj(10, wv3Var, view, c10389xffc30b0, y0Var, view2 != null ? view2.getWidth() : 0, 0, activityC16377xf00b6def.f227853z, i17);
    }
}
