package com.p314xaae8f345.mm.p2633x99f0578a.ui;

/* renamed from: com.tencent.mm.transvoice.ui.RingView */
/* loaded from: classes5.dex */
public class C21329xba17e515 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f277954d;

    /* renamed from: e, reason: collision with root package name */
    public int f277955e;

    /* renamed from: f, reason: collision with root package name */
    public float f277956f;

    /* renamed from: g, reason: collision with root package name */
    public float f277957g;

    /* renamed from: h, reason: collision with root package name */
    public float f277958h;

    /* renamed from: i, reason: collision with root package name */
    public int f277959i;

    public C21329xba17e515(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f277954d = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544644r, i17, 0);
            this.f277955e = obtainStyledAttributes.getColor(0, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            this.f277956f = obtainStyledAttributes.getFloat(1, 100.0f);
            this.f277958h = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f277957g = obtainStyledAttributes.getFloat(2, -90.0f);
            this.f277959i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: getProgress */
    public float m78262x402effa3() {
        return this.f277958h;
    }

    /* renamed from: getRoundWidth */
    public int m78263xe5180cce() {
        return this.f277959i;
    }

    /* renamed from: getStartAngle */
    public float m78264x8ed2e987() {
        return this.f277957g;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int i17 = (width - (this.f277959i / 2)) - 1;
        getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560075ad);
        this.f277954d.setStrokeWidth(this.f277959i);
        this.f277954d.setColor(this.f277955e);
        this.f277954d.setAlpha(0);
        this.f277954d.setAntiAlias(true);
        this.f277954d.setStyle(android.graphics.Paint.Style.STROKE);
        float f17 = width;
        canvas.drawCircle(f17, f17, i17, this.f277954d);
        this.f277954d.setStrokeWidth(this.f277959i);
        this.f277954d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f277954d.setColor(this.f277955e);
        float f18 = width - i17;
        float f19 = width + i17;
        canvas.drawArc(new android.graphics.RectF(f18, f18, f19, f19), this.f277957g, (this.f277958h * 360.0f) / this.f277956f, false, this.f277954d);
    }

    /* renamed from: setProgress */
    public void m78265x3ae760af(float f17) {
        this.f277958h = java.lang.Math.max(0.0f, f17);
        this.f277958h = java.lang.Math.min(f17, this.f277956f);
        invalidate();
    }

    /* renamed from: setProgressColor */
    public void m78266x7d38f3f4(int i17) {
        this.f277955e = i17;
        invalidate();
    }

    /* renamed from: setRoundWidth */
    public void m78267x133c5ada(int i17) {
        if (this.f277959i == i17) {
            return;
        }
        this.f277959i = i17;
        invalidate();
    }

    /* renamed from: setStartAngle */
    public void m78268xbcf73793(float f17) {
        this.f277957g = f17;
        invalidate();
    }

    public C21329xba17e515(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17);
    }
}
