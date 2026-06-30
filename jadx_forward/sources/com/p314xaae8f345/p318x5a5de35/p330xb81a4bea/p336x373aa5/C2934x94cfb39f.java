package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5;

/* renamed from: com.tencent.cloud.huiyan.view.CommonAuthBackView */
/* loaded from: classes4.dex */
public class C2934x94cfb39f extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f127438d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Point f127439e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f127440f;

    public C2934x94cfb39f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Point point = this.f127439e;
        canvas.drawCircle(point.x, point.y, this.f127438d, this.f127440f);
    }

    @Override // android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        android.graphics.Point point = this.f127439e;
        int i19 = size >> 1;
        point.x = i19;
        int i27 = size2 >> 1;
        point.y = i27;
        if (i19 > i27) {
            i19 = i27;
        }
        this.f127438d = i19;
        this.f127438d = i19 - java.lang.Math.round(getResources().getDisplayMetrics().density * 5.0f);
        setMeasuredDimension(size, size2);
    }

    public C2934x94cfb39f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f127439e = new android.graphics.Point();
        this.f127440f = new android.graphics.Paint();
        this.f127440f.setPathEffect(new android.graphics.DashPathEffect(new float[]{java.lang.Math.round(getResources().getDisplayMetrics().density * 1.5f), java.lang.Math.round(getResources().getDisplayMetrics().density * 25.0f)}, java.lang.Math.round(getResources().getDisplayMetrics().density * 0.0f)));
        this.f127440f.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.an8));
        this.f127440f.setStyle(android.graphics.Paint.Style.STROKE);
        this.f127440f.setStrokeWidth(java.lang.Math.round(getResources().getDisplayMetrics().density * 6.0f));
    }
}
