package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow */
/* loaded from: classes3.dex */
public class C16542x2e9b46d3 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f230465d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f230466e;

    /* renamed from: f, reason: collision with root package name */
    public int f230467f;

    /* renamed from: g, reason: collision with root package name */
    public float f230468g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f230469h;

    /* renamed from: i, reason: collision with root package name */
    public int f230470i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f230471m;

    public C16542x2e9b46d3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getBorderWidth */
    public int m66932x602cbc4() {
        return this.f230467f;
    }

    /* renamed from: getWindowHeight */
    public int m66933xae337ad() {
        return getHeight();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f230470i;
        int i18 = this.f230465d + i17;
        if (i17 > 0 || i18 > 0) {
            if (i17 > 0) {
                canvas.drawRect(0.0f, 0.0f, i17, m66933xae337ad(), this.f230469h);
            }
            if (i18 < getWidth()) {
                canvas.drawRect(i18, 0.0f, getWidth(), m66933xae337ad(), this.f230469h);
            }
            android.graphics.RectF rectF = this.f230471m;
            rectF.set(i17, this.f230468g, i18, m66933xae337ad() - this.f230468g);
            canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f230466e);
            m66933xae337ad();
        }
    }

    public C16542x2e9b46d3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230470i = 0;
        this.f230471m = new android.graphics.RectF();
        postInvalidate();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230469h = paint;
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        this.f230469h.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f230466e = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.f230466e.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 2.0f, getContext().getResources().getDisplayMetrics()));
        this.f230467f = round;
        this.f230466e.setStrokeWidth(round);
        this.f230468g = this.f230467f * 0.5f;
    }
}
