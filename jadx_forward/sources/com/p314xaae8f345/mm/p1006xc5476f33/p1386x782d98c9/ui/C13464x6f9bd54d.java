package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView */
/* loaded from: classes5.dex */
public class C13464x6f9bd54d extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f180777d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f180778e;

    /* renamed from: f, reason: collision with root package name */
    public int f180779f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180780g;

    /* renamed from: h, reason: collision with root package name */
    public final int f180781h;

    /* renamed from: i, reason: collision with root package name */
    public int f180782i;

    /* renamed from: m, reason: collision with root package name */
    public int f180783m;

    /* renamed from: n, reason: collision with root package name */
    public final int f180784n;

    /* renamed from: o, reason: collision with root package name */
    public int f180785o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f180786p;

    public C13464x6f9bd54d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f180785o == 1) {
            int width = getWidth() / 2;
            android.graphics.Paint paint = this.f180778e;
            paint.setARGB(255, 103, 209, 79);
            paint.setStrokeWidth(this.f180784n);
            int i17 = this.f180782i;
            int i18 = this.f180780g;
            if (i17 == -1) {
                this.f180782i = (width * 2) - i18;
            }
            if (this.f180783m == -1) {
                this.f180783m = this.f180782i;
            }
            canvas.drawArc(new android.graphics.RectF(i18, this.f180781h, this.f180782i, this.f180783m), 270.0f, this.f180779f, false, paint);
            int i19 = this.f180779f + 5;
            this.f180779f = i19;
            if (i19 > 365) {
                this.f180779f = 0;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f180777d;
            java.lang.Runnable runnable = this.f180786p;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, 100);
        }
    }

    /* renamed from: setState */
    public void m55080x53b6854f(int i17) {
        this.f180785o = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f180777d;
        java.lang.Runnable runnable = this.f180786p;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 10);
    }

    public C13464x6f9bd54d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180779f = 2;
        this.f180780g = -1;
        this.f180781h = -1;
        this.f180782i = -1;
        this.f180783m = -1;
        this.f180784n = -1;
        this.f180786p = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.x1(this);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f180778e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        int b17 = i65.a.b(context, 2);
        this.f180780g = b17;
        this.f180781h = b17;
        this.f180784n = i65.a.b(context, 3);
        this.f180777d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }
}
