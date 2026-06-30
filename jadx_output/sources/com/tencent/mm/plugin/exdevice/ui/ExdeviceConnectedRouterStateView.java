package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class ExdeviceConnectedRouterStateView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f99244d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f99245e;

    /* renamed from: f, reason: collision with root package name */
    public int f99246f;

    /* renamed from: g, reason: collision with root package name */
    public final int f99247g;

    /* renamed from: h, reason: collision with root package name */
    public final int f99248h;

    /* renamed from: i, reason: collision with root package name */
    public int f99249i;

    /* renamed from: m, reason: collision with root package name */
    public int f99250m;

    /* renamed from: n, reason: collision with root package name */
    public final int f99251n;

    /* renamed from: o, reason: collision with root package name */
    public int f99252o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f99253p;

    public ExdeviceConnectedRouterStateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f99252o == 1) {
            int width = getWidth() / 2;
            android.graphics.Paint paint = this.f99245e;
            paint.setARGB(255, 103, 209, 79);
            paint.setStrokeWidth(this.f99251n);
            int i17 = this.f99249i;
            int i18 = this.f99247g;
            if (i17 == -1) {
                this.f99249i = (width * 2) - i18;
            }
            if (this.f99250m == -1) {
                this.f99250m = this.f99249i;
            }
            canvas.drawArc(new android.graphics.RectF(i18, this.f99248h, this.f99249i, this.f99250m), 270.0f, this.f99246f, false, paint);
            int i19 = this.f99246f + 5;
            this.f99246f = i19;
            if (i19 > 365) {
                this.f99246f = 0;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f99244d;
            java.lang.Runnable runnable = this.f99253p;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, 100);
        }
    }

    public void setState(int i17) {
        this.f99252o = i17;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f99244d;
        java.lang.Runnable runnable = this.f99253p;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 10);
    }

    public ExdeviceConnectedRouterStateView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f99246f = 2;
        this.f99247g = -1;
        this.f99248h = -1;
        this.f99249i = -1;
        this.f99250m = -1;
        this.f99251n = -1;
        this.f99253p = new com.tencent.mm.plugin.exdevice.ui.x1(this);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f99245e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        int b17 = i65.a.b(context, 2);
        this.f99247g = b17;
        this.f99248h = b17;
        this.f99251n = i65.a.b(context, 3);
        this.f99244d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }
}
