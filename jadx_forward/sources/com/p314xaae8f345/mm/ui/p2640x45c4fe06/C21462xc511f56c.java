package com.p314xaae8f345.mm.ui.p2640x45c4fe06;

/* renamed from: com.tencent.mm.ui.appbrand.NewPullDownView */
/* loaded from: classes4.dex */
public class C21462xc511f56c extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f278718d;

    /* renamed from: e, reason: collision with root package name */
    public float f278719e;

    /* renamed from: f, reason: collision with root package name */
    public float f278720f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f278721g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f278722h;

    public C21462xc511f56c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278718d = 0.0f;
        this.f278719e = getResources().getDisplayMetrics().density * 20.0f;
        this.f278720f = (getResources().getDisplayMetrics().density * 14.0f) - (getResources().getDisplayMetrics().density * 4.0f);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f278721g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f278721g.setColor(-4408132);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f278722h = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f278722h.setColor(0);
        this.f278722h.setStrokeWidth(getResources().getDisplayMetrics().density * 4.0f);
        this.f278722h.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.drawCircle(measuredWidth, measuredHeight, (this.f278718d * this.f278719e) / 2.0f, this.f278721g);
        float f17 = this.f278718d;
        if (f17 >= 0.4f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (((f17 - 0.4f) / 0.6f) * this.f278720f) / 2.0f, this.f278722h);
        }
        canvas.restore();
    }

    /* renamed from: setVerticalScrollPercent */
    public void m78852x7e58e1a0(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PullDownView", "[setVerticalScrollPercent] percent:%s", java.lang.Float.valueOf(f17));
        this.f278718d = java.lang.Math.max(0.0f, java.lang.Math.min(f17, 1.0f));
        postInvalidate();
    }
}
