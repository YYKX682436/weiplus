package com.tencent.mm.plugin.bizui.widget;

/* loaded from: classes3.dex */
public class BizTagTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f93903g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f93904h;

    /* renamed from: i, reason: collision with root package name */
    public int f93905i;

    /* renamed from: m, reason: collision with root package name */
    public int f93906m;

    /* renamed from: n, reason: collision with root package name */
    public int f93907n;

    public BizTagTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f93903g = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f93904h = new android.graphics.Paint();
        this.f93905i = 3;
        this.f93906m = 9;
        this.f93907n = 0;
        b();
    }

    public void b() {
        this.f93905i = java.lang.Math.round(i65.a.g(getContext()) * 1.0f);
        this.f93906m = i65.a.b(getContext(), 3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f93903g;
        rectF.left = 0.0f;
        rectF.top = this.f93905i;
        rectF.right = getWidth();
        rectF.bottom = getHeight() - this.f93905i;
        android.graphics.Paint paint = this.f93904h;
        paint.setAntiAlias(true);
        int i17 = this.f93907n;
        if (i17 != 0) {
            paint.setColor(i17);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            int i18 = this.f93906m;
            canvas.drawRoundRect(rectF, i18, i18, paint);
        }
        super.onDraw(canvas);
    }

    public void setFillColor(int i17) {
        this.f93907n = i17;
    }

    public BizTagTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f93903g = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f93904h = new android.graphics.Paint();
        this.f93905i = 3;
        this.f93906m = 9;
        this.f93907n = 0;
        b();
    }
}
