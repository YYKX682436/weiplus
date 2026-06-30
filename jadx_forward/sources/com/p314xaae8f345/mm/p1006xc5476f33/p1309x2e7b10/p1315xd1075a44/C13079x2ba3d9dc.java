package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44;

/* renamed from: com.tencent.mm.plugin.card.widget.CardTagTextView */
/* loaded from: classes9.dex */
public class C13079x2ba3d9dc extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f177000d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f177001e;

    /* renamed from: f, reason: collision with root package name */
    public int f177002f;

    /* renamed from: g, reason: collision with root package name */
    public int f177003g;

    /* renamed from: h, reason: collision with root package name */
    public int f177004h;

    /* renamed from: i, reason: collision with root package name */
    public int f177005i;

    public C13079x2ba3d9dc(android.content.Context context) {
        super(context);
        this.f177000d = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f177001e = new android.graphics.Paint();
        this.f177002f = 3;
        this.f177003g = 9;
        this.f177004h = 0;
        this.f177005i = 0;
        a();
    }

    public void a() {
        this.f177002f = java.lang.Math.round(i65.a.g(getContext()) * 0.5f);
        this.f177003g = i65.a.b(getContext(), 3);
        this.f177004h = getCurrentTextColor();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17 = this.f177003g;
        android.graphics.RectF rectF = this.f177000d;
        rectF.left = f17;
        rectF.top = this.f177002f;
        rectF.right = getWidth() - this.f177003g;
        rectF.bottom = getHeight() - this.f177002f;
        android.graphics.Paint paint = this.f177001e;
        paint.setAntiAlias(true);
        int i17 = this.f177005i;
        if (i17 != 0) {
            paint.setColor(i17);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRoundRect(rectF, (getHeight() / 2) - this.f177002f, (getHeight() / 2) - this.f177002f, paint);
        }
        paint.setColor(this.f177004h);
        paint.setStrokeWidth(this.f177002f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawRoundRect(rectF, (getHeight() / 2) - this.f177002f, (getHeight() / 2) - this.f177002f, paint);
        super.onDraw(canvas);
    }

    /* renamed from: setFillColor */
    public void m54468x17b1755e(int i17) {
        this.f177005i = i17;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i17) {
        this.f177004h = i17;
        super.setTextColor(i17);
    }

    public C13079x2ba3d9dc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177000d = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f177001e = new android.graphics.Paint();
        this.f177002f = 3;
        this.f177003g = 9;
        this.f177004h = 0;
        this.f177005i = 0;
        a();
    }

    public C13079x2ba3d9dc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f177000d = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f177001e = new android.graphics.Paint();
        this.f177002f = 3;
        this.f177003g = 9;
        this.f177004h = 0;
        this.f177005i = 0;
        a();
    }
}
