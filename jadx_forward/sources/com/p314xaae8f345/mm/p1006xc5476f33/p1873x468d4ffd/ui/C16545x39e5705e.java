package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView */
/* loaded from: classes10.dex */
public class C16545x39e5705e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f230651d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f230652e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230653f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f230654g;

    /* renamed from: h, reason: collision with root package name */
    public long f230655h;

    /* renamed from: i, reason: collision with root package name */
    public int f230656i;

    /* renamed from: m, reason: collision with root package name */
    public int f230657m;

    /* renamed from: n, reason: collision with root package name */
    public int f230658n;

    /* renamed from: o, reason: collision with root package name */
    public int f230659o;

    /* renamed from: p, reason: collision with root package name */
    public int f230660p;

    public C16545x39e5705e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230651d = new android.graphics.Paint();
        this.f230652e = false;
        this.f230653f = false;
        this.f230654g = false;
        this.f230655h = 0L;
    }

    public void a(float f17, float f18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f17) - (this.f230656i / 2);
        marginLayoutParams.topMargin = ((int) f18) - (this.f230657m / 2);
        setLayoutParams(marginLayoutParams);
        setVisibility(0);
        this.f230652e = true;
        this.f230653f = false;
        this.f230654g = false;
        this.f230655h = java.lang.System.currentTimeMillis();
        invalidate();
    }

    public void b(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        this.f230656i = i17;
        this.f230657m = i18;
        this.f230658n = i17 / 2;
        this.f230659o = i18 / 2;
        this.f230660p = i65.a.b(getContext(), 1);
        android.graphics.Paint paint = this.f230651d;
        paint.setColor(-12206054);
        paint.setStrokeWidth(this.f230660p);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.f230658n / 2, this.f230659o / 2);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f230655h;
        if (currentTimeMillis > 200) {
            this.f230652e = false;
            this.f230653f = true;
        }
        if (currentTimeMillis > 800) {
            this.f230653f = false;
        }
        if (currentTimeMillis > 1100) {
            this.f230654g = true;
        }
        if (currentTimeMillis > 1300) {
            this.f230654g = false;
            canvas.drawColor(0);
            return;
        }
        boolean z17 = this.f230652e;
        android.graphics.Paint paint = this.f230651d;
        if (z17) {
            float f17 = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f17, f17, this.f230658n / 2, this.f230659o / 2);
            paint.setAlpha((int) ((2.0f - f17) * 255.0f));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f230653f) {
            float f18 = (((float) ((currentTimeMillis - 200) % 200)) / 200.0f) * 2.0f;
            paint.setAlpha((int) (((f18 > 1.0f ? f18 - 1.0f : 1.0f - f18) * 128.0f) + 127.0f));
        } else {
            paint.setAlpha(255);
        }
        if (this.f230654g) {
            paint.setAlpha((int) ((1.0f - (((float) (currentTimeMillis - 1100)) / 200.0f)) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, this.f230658n, 0.0f, paint);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f230659o, paint);
        int i17 = this.f230658n;
        canvas.drawLine(i17, 0.0f, i17, this.f230659o, paint);
        int i18 = this.f230659o;
        canvas.drawLine(0.0f, i18, this.f230658n, i18, paint);
        int i19 = this.f230659o;
        canvas.drawLine(0.0f, i19 / 2, this.f230658n / 10, i19 / 2, paint);
        int i27 = this.f230658n;
        int i28 = this.f230659o;
        canvas.drawLine(i27, i28 / 2, (i27 * 9) / 10, i28 / 2, paint);
        int i29 = this.f230658n;
        canvas.drawLine(i29 / 2, 0.0f, i29 / 2, this.f230659o / 10, paint);
        int i37 = this.f230658n;
        canvas.drawLine(i37 / 2, this.f230659o, i37 / 2, (r3 * 9) / 10, paint);
        invalidate();
    }

    /* renamed from: setFocusColor */
    public void m66949xdcc3376d(int i17) {
        if (i17 != 0) {
            this.f230651d.setColor(i17);
        }
    }

    public C16545x39e5705e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230651d = new android.graphics.Paint();
        this.f230652e = false;
        this.f230653f = false;
        this.f230654g = false;
        this.f230655h = 0L;
    }
}
