package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.api;

/* renamed from: com.tencent.mm.plugin.taskbar.api.GyroView */
/* loaded from: classes3.dex */
public class C18553x9912ca14 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f254014d;

    /* renamed from: e, reason: collision with root package name */
    public float f254015e;

    /* renamed from: f, reason: collision with root package name */
    public float f254016f;

    /* renamed from: g, reason: collision with root package name */
    public float f254017g;

    /* renamed from: h, reason: collision with root package name */
    public float f254018h;

    /* renamed from: i, reason: collision with root package name */
    public float f254019i;

    /* renamed from: m, reason: collision with root package name */
    public float f254020m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f254021n;

    public C18553x9912ca14(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f254014d = 0.0f;
        this.f254015e = 0.0f;
        this.f254017g = getResources().getDisplayMetrics().density * 40.0f;
        this.f254016f = getResources().getDisplayMetrics().density * 100.0f;
        this.f254018h = getResources().getDisplayMetrics().density * 20.0f;
        this.f254019i = getResources().getDisplayMetrics().density * 10.0f;
        this.f254020m = getResources().getDisplayMetrics().density * 6.0f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f254021n = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f254021n.setColor(-9934744);
    }

    public void a(float f17, int i17) {
        float f18 = this.f254017g;
        this.f254015e = java.lang.Math.max(0.0f, java.lang.Math.min((f17 - f18) / (i17 - f18), 1.0f));
        this.f254014d = java.lang.Math.max(0.0f, java.lang.Math.min(f17 / this.f254017g, 1.0f));
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f17 = this.f254015e;
        if (f17 <= 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (this.f254014d * this.f254019i) / 2.0f, this.f254021n);
            return;
        }
        float f18 = this.f254019i;
        canvas.drawCircle(measuredWidth, measuredHeight, (f18 / 2.0f) - ((f17 * (f18 - this.f254020m)) / 2.0f), this.f254021n);
        canvas.drawCircle(measuredWidth - (this.f254015e * this.f254018h), measuredHeight, this.f254020m / 2.0f, this.f254021n);
        canvas.drawCircle(measuredWidth + (this.f254015e * this.f254018h), measuredHeight, this.f254020m / 2.0f, this.f254021n);
    }

    /* renamed from: setVerticalScroll */
    public void m71585x9a8b7ee5(float f17) {
        float f18 = this.f254017g;
        this.f254015e = java.lang.Math.max(0.0f, java.lang.Math.min((f17 - f18) / (this.f254016f - f18), 1.0f));
        this.f254014d = java.lang.Math.max(0.0f, java.lang.Math.min(f17 / this.f254017g, 1.0f));
        postInvalidate();
    }
}
