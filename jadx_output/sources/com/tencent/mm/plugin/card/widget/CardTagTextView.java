package com.tencent.mm.plugin.card.widget;

/* loaded from: classes9.dex */
public class CardTagTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f95467d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f95468e;

    /* renamed from: f, reason: collision with root package name */
    public int f95469f;

    /* renamed from: g, reason: collision with root package name */
    public int f95470g;

    /* renamed from: h, reason: collision with root package name */
    public int f95471h;

    /* renamed from: i, reason: collision with root package name */
    public int f95472i;

    public CardTagTextView(android.content.Context context) {
        super(context);
        this.f95467d = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f95468e = new android.graphics.Paint();
        this.f95469f = 3;
        this.f95470g = 9;
        this.f95471h = 0;
        this.f95472i = 0;
        a();
    }

    public void a() {
        this.f95469f = java.lang.Math.round(i65.a.g(getContext()) * 0.5f);
        this.f95470g = i65.a.b(getContext(), 3);
        this.f95471h = getCurrentTextColor();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17 = this.f95470g;
        android.graphics.RectF rectF = this.f95467d;
        rectF.left = f17;
        rectF.top = this.f95469f;
        rectF.right = getWidth() - this.f95470g;
        rectF.bottom = getHeight() - this.f95469f;
        android.graphics.Paint paint = this.f95468e;
        paint.setAntiAlias(true);
        int i17 = this.f95472i;
        if (i17 != 0) {
            paint.setColor(i17);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRoundRect(rectF, (getHeight() / 2) - this.f95469f, (getHeight() / 2) - this.f95469f, paint);
        }
        paint.setColor(this.f95471h);
        paint.setStrokeWidth(this.f95469f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawRoundRect(rectF, (getHeight() / 2) - this.f95469f, (getHeight() / 2) - this.f95469f, paint);
        super.onDraw(canvas);
    }

    public void setFillColor(int i17) {
        this.f95472i = i17;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i17) {
        this.f95471h = i17;
        super.setTextColor(i17);
    }

    public CardTagTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95467d = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f95468e = new android.graphics.Paint();
        this.f95469f = 3;
        this.f95470g = 9;
        this.f95471h = 0;
        this.f95472i = 0;
        a();
    }

    public CardTagTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f95467d = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f95468e = new android.graphics.Paint();
        this.f95469f = 3;
        this.f95470g = 9;
        this.f95471h = 0;
        this.f95472i = 0;
        a();
    }
}
