package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f101253a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f101254b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f101255c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f101256d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.l1 f101257e;

    /* renamed from: f, reason: collision with root package name */
    public int f101258f;

    /* renamed from: g, reason: collision with root package name */
    public int f101259g;

    /* renamed from: h, reason: collision with root package name */
    public int f101260h;

    /* renamed from: i, reason: collision with root package name */
    public int f101261i;

    /* renamed from: j, reason: collision with root package name */
    public float f101262j;

    /* renamed from: k, reason: collision with root package name */
    public float f101263k;

    /* renamed from: l, reason: collision with root package name */
    public float f101264l;

    /* renamed from: m, reason: collision with root package name */
    public float f101265m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f101266n;

    public m1(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.fav.ui.l1 l1Var) {
        this.f101254b = mMGestureGallery;
        this.f101253a = mMActivity;
        this.f101257e = l1Var;
        this.f101256d = (android.widget.ImageView) mMActivity.findViewById(com.tencent.mm.R.id.ght);
        this.f101255c = this.f101253a.findViewById(com.tencent.mm.R.id.m7j);
        this.f101254b.setGalleryScaleListener(new com.tencent.mm.plugin.fav.ui.i1(this));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f101266n = ofFloat;
        ofFloat.setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        this.f101266n.addUpdateListener(new com.tencent.mm.plugin.fav.ui.j1(this));
        this.f101266n.addListener(new com.tencent.mm.plugin.fav.ui.k1(this));
    }

    public void a(boolean z17) {
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f101254b;
        if (mMGestureGallery == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDragLogic", "goBack() gallery == null");
            return;
        }
        this.f101258f = 0;
        this.f101259g = 0;
        this.f101260h = mMGestureGallery.getWidth() / 2;
        this.f101261i = this.f101254b.getHeight() / 2;
        if (!z17 && this.f101257e != null) {
            com.tencent.mm.autogen.events.FavUIPhotoInfoEvent favUIPhotoInfoEvent = new com.tencent.mm.autogen.events.FavUIPhotoInfoEvent();
            favUIPhotoInfoEvent.f54241g.f8368a = this.f101257e.Y5();
            favUIPhotoInfoEvent.e();
            am.y9 y9Var = favUIPhotoInfoEvent.f54242h;
            this.f101258f = y9Var.f8446c;
            this.f101259g = y9Var.f8447d;
            this.f101260h = y9Var.f8444a;
            this.f101261i = y9Var.f8445b;
        }
        if (this.f101260h == 0 && this.f101261i == 0) {
            this.f101260h = this.f101254b.getWidth() / 2;
            this.f101261i = this.f101254b.getHeight() / 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDragLogic", "thumbLeft %d, thumbTop %d, thumbWidth %d, thumbHeight %d", java.lang.Integer.valueOf(this.f101260h), java.lang.Integer.valueOf(this.f101261i), java.lang.Integer.valueOf(this.f101258f), java.lang.Integer.valueOf(this.f101259g));
        this.f101266n.start();
    }
}
