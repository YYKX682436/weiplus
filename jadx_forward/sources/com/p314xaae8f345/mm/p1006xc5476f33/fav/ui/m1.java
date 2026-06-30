package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f182786a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f182787b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f182788c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f182789d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 f182790e;

    /* renamed from: f, reason: collision with root package name */
    public int f182791f;

    /* renamed from: g, reason: collision with root package name */
    public int f182792g;

    /* renamed from: h, reason: collision with root package name */
    public int f182793h;

    /* renamed from: i, reason: collision with root package name */
    public int f182794i;

    /* renamed from: j, reason: collision with root package name */
    public float f182795j;

    /* renamed from: k, reason: collision with root package name */
    public float f182796k;

    /* renamed from: l, reason: collision with root package name */
    public float f182797l;

    /* renamed from: m, reason: collision with root package name */
    public float f182798m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f182799n;

    public m1(com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 l1Var) {
        this.f182787b = c22506x89e75b89;
        this.f182786a = abstractActivityC21394xb3d2c0cf;
        this.f182790e = l1Var;
        this.f182789d = (android.widget.ImageView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.f182788c = this.f182786a.findViewById(com.p314xaae8f345.mm.R.id.m7j);
        this.f182787b.mo55654x9bfee16e(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i1(this));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f182799n = ofFloat;
        ofFloat.setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        this.f182799n.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j1(this));
        this.f182799n.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k1(this));
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f182787b;
        if (c22506x89e75b89 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDragLogic", "goBack() gallery == null");
            return;
        }
        this.f182791f = 0;
        this.f182792g = 0;
        this.f182793h = c22506x89e75b89.getWidth() / 2;
        this.f182794i = this.f182787b.getHeight() / 2;
        if (!z17 && this.f182790e != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5430x5ea11529 c5430x5ea11529 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5430x5ea11529();
            c5430x5ea11529.f135774g.f89901a = this.f182790e.Y5();
            c5430x5ea11529.e();
            am.y9 y9Var = c5430x5ea11529.f135775h;
            this.f182791f = y9Var.f89979c;
            this.f182792g = y9Var.f89980d;
            this.f182793h = y9Var.f89977a;
            this.f182794i = y9Var.f89978b;
        }
        if (this.f182793h == 0 && this.f182794i == 0) {
            this.f182793h = this.f182787b.getWidth() / 2;
            this.f182794i = this.f182787b.getHeight() / 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDragLogic", "thumbLeft %d, thumbTop %d, thumbWidth %d, thumbHeight %d", java.lang.Integer.valueOf(this.f182793h), java.lang.Integer.valueOf(this.f182794i), java.lang.Integer.valueOf(this.f182791f), java.lang.Integer.valueOf(this.f182792g));
        this.f182799n.start();
    }
}
