package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes9.dex */
public final class nc extends android.widget.TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f132022a;

    /* renamed from: b, reason: collision with root package name */
    private float f132023b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f132024c;

    public nc(android.content.Context context) {
        super(context);
        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        getPaint().setFakeBoldText(true);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f132024c) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f132023b <= 0.0f) {
            super.onDraw(canvas);
            return;
        }
        this.f132024c = true;
        int currentTextColor = getCurrentTextColor();
        android.text.TextPaint paint = getPaint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f132023b);
        setTextColor(this.f132022a);
        super.onDraw(canvas);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        setTextColor(currentTextColor);
        super.onDraw(canvas);
        setTextColor(currentTextColor);
        this.f132024c = false;
    }

    /* renamed from: setStrokeColor */
    public final void m36839xe1d3a649(int i17) {
        this.f132022a = i17;
    }

    /* renamed from: setStrokeWidth */
    public final void m36840xe2eaa4ac(float f17) {
        this.f132023b = f17;
    }
}
