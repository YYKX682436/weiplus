package com.tencent.mapsdk.internal;

/* loaded from: classes9.dex */
public final class nc extends android.widget.TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f50489a;

    /* renamed from: b, reason: collision with root package name */
    private float f50490b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f50491c;

    public nc(android.content.Context context) {
        super(context);
        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        getPaint().setFakeBoldText(true);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f50491c) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50490b <= 0.0f) {
            super.onDraw(canvas);
            return;
        }
        this.f50491c = true;
        int currentTextColor = getCurrentTextColor();
        android.text.TextPaint paint = getPaint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f50490b);
        setTextColor(this.f50489a);
        super.onDraw(canvas);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        setTextColor(currentTextColor);
        super.onDraw(canvas);
        setTextColor(currentTextColor);
        this.f50491c = false;
    }

    public final void setStrokeColor(int i17) {
        this.f50489a = i17;
    }

    public final void setStrokeWidth(float f17) {
        this.f50490b = f17;
    }
}
