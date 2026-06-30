package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes11.dex */
public abstract class n1 extends android.graphics.drawable.BitmapDrawable implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 f272427q = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f272428d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272429e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f272430f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f272431g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272432h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f272433i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f272434m;

    /* renamed from: n, reason: collision with root package name */
    public final float f272435n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.l1 f272436o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f272437p;

    public n1(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var, java.lang.String str) {
        super(j1Var.uc());
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f272428d = paint;
        this.f272429e = false;
        this.f272430f = false;
        this.f272435n = 1.0f;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setAntiAlias(true);
        this.f272437p = new com.p314xaae8f345.mm.p2470x93e71c27.ui.i1(this);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f272433i = j1Var;
        this.f272434m = str;
        j1Var.X9(this);
    }

    public void U(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.l1 l1Var = this.f272436o;
        if ((l1Var == null || !l1Var.U(str)) && str != null && str.equals(this.f272434m)) {
            f272427q.e(this.f272437p, 0L);
        }
    }

    public void a() {
        f272427q.d(this.f272437p);
    }

    public void b(java.lang.String str) {
        if (str == null || str.length() <= 0 || str.equals(this.f272434m)) {
            return;
        }
        this.f272434m = str;
        f272427q.d(this.f272437p);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect;
        boolean z17 = this.f272430f;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f272433i;
        android.graphics.Bitmap Zg = z17 ? j1Var.Zg(this.f272434m, canvas.getWidth(), canvas.getHeight(), 1) : this.f272431g ? j1Var.W0(this.f272434m) : j1Var.mo560xd586ddb5(this.f272434m);
        if (Zg == null || Zg.isRecycled()) {
            Zg = j1Var.uc();
            if (this.f272431g) {
                this.f272432h = true;
            } else {
                this.f272432h = false;
            }
        } else {
            this.f272432h = false;
        }
        android.graphics.Rect bounds = getBounds();
        if (this.f272435n > 1.0f || this.f272429e) {
            int height = (Zg.getHeight() / 15) / 2;
            int width = (Zg.getWidth() / 15) / 2;
            rect = new android.graphics.Rect(width, height, Zg.getWidth() - width, Zg.getHeight() - height);
        } else {
            rect = null;
        }
        canvas.drawBitmap(Zg, rect, bounds, this.f272428d);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a0
    /* renamed from: onScrollStateChanged */
    public void mo75389x4d79408f(boolean z17) {
        if (z17) {
            this.f272431g = true;
            return;
        }
        if (this.f272431g) {
            this.f272431g = false;
            if (this.f272432h) {
                this.f272432h = false;
                invalidateSelf();
            }
        }
    }

    public n1(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var, java.lang.String str, boolean z17) {
        super(j1Var.uc());
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f272428d = paint;
        this.f272429e = false;
        this.f272430f = false;
        this.f272435n = 1.0f;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setAntiAlias(true);
        this.f272437p = new com.p314xaae8f345.mm.p2470x93e71c27.ui.i1(this);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f272429e = z17;
        this.f272433i = j1Var;
        this.f272434m = str;
        j1Var.X9(this);
    }
}
