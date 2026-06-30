package com.tencent.mm.media.camera.view.control;

/* loaded from: classes4.dex */
public class CameraFocusView extends android.view.View implements cs0.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f68901d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f68902e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68903f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f68904g;

    /* renamed from: h, reason: collision with root package name */
    public long f68905h;

    /* renamed from: i, reason: collision with root package name */
    public int f68906i;

    /* renamed from: m, reason: collision with root package name */
    public int f68907m;

    /* renamed from: n, reason: collision with root package name */
    public int f68908n;

    /* renamed from: o, reason: collision with root package name */
    public int f68909o;

    /* renamed from: p, reason: collision with root package name */
    public int f68910p;

    /* renamed from: q, reason: collision with root package name */
    public int f68911q;

    public CameraFocusView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68901d = new android.graphics.Paint();
        this.f68902e = false;
        this.f68903f = false;
        this.f68904g = false;
        this.f68905h = 0L;
        this.f68906i = -12206054;
    }

    @Override // cs0.i
    public void a(float f17, float f18, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f17) - (this.f68907m / 2);
        marginLayoutParams.topMargin = ((int) f18) - (this.f68908n / 2);
        setLayoutParams(marginLayoutParams);
        setVisibility(0);
        this.f68902e = true;
        this.f68903f = false;
        this.f68904g = false;
        this.f68905h = java.lang.System.currentTimeMillis();
        invalidate();
    }

    @Override // cs0.i
    public void b(float f17, cs0.h hVar) {
    }

    @Override // cs0.i
    public void c(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        this.f68907m = i17;
        this.f68908n = i18;
        this.f68909o = i17 / 2;
        this.f68910p = i18 / 2;
        this.f68911q = i65.a.b(getContext(), 1);
        android.graphics.Paint paint = this.f68901d;
        paint.setColor(this.f68906i);
        paint.setStrokeWidth(this.f68911q);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.f68909o / 2, this.f68910p / 2);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f68905h;
        if (currentTimeMillis > 200) {
            this.f68902e = false;
            this.f68903f = true;
        }
        if (currentTimeMillis > 800) {
            this.f68903f = false;
        }
        if (currentTimeMillis > 1100) {
            this.f68904g = true;
        }
        if (currentTimeMillis > 1300) {
            this.f68904g = false;
            canvas.drawColor(0);
            return;
        }
        boolean z17 = this.f68902e;
        android.graphics.Paint paint = this.f68901d;
        if (z17) {
            float f17 = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f17, f17, this.f68909o / 2, this.f68910p / 2);
            paint.setAlpha((int) ((2.0f - f17) * 255.0f));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f68903f) {
            float f18 = (((float) ((currentTimeMillis - 200) % 200)) / 200.0f) * 2.0f;
            paint.setAlpha((int) (((f18 > 1.0f ? f18 - 1.0f : 1.0f - f18) * 128.0f) + 127.0f));
        } else {
            paint.setAlpha(255);
        }
        if (this.f68904g) {
            paint.setAlpha((int) ((1.0f - (((float) (currentTimeMillis - 1100)) / 200.0f)) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, this.f68909o, 0.0f, paint);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f68910p, paint);
        int i17 = this.f68909o;
        canvas.drawLine(i17, 0.0f, i17, this.f68910p, paint);
        int i18 = this.f68910p;
        canvas.drawLine(0.0f, i18, this.f68909o, i18, paint);
        int i19 = this.f68910p;
        canvas.drawLine(0.0f, i19 / 2, this.f68909o / 10, i19 / 2, paint);
        int i27 = this.f68909o;
        int i28 = this.f68910p;
        canvas.drawLine(i27, i28 / 2, (i27 * 9) / 10, i28 / 2, paint);
        int i29 = this.f68909o;
        canvas.drawLine(i29 / 2, 0.0f, i29 / 2, this.f68910p / 10, paint);
        int i37 = this.f68909o;
        canvas.drawLine(i37 / 2, this.f68910p, i37 / 2, (r3 * 9) / 10, paint);
        invalidate();
    }

    @Override // cs0.i
    public void reset() {
    }

    @Override // cs0.i
    public void setFocusColor(int i17) {
        if (i17 != 0) {
            this.f68906i = i17;
            this.f68901d.setColor(i17);
        }
    }

    @Override // cs0.i
    public void setOrientation(int i17) {
    }

    public CameraFocusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68901d = new android.graphics.Paint();
        this.f68902e = false;
        this.f68903f = false;
        this.f68904g = false;
        this.f68905h = 0L;
        this.f68906i = -12206054;
    }

    public CameraFocusView(android.content.Context context) {
        super(context);
        this.f68901d = new android.graphics.Paint();
        this.f68902e = false;
        this.f68903f = false;
        this.f68904g = false;
        this.f68905h = 0L;
        this.f68906i = -12206054;
    }
}
