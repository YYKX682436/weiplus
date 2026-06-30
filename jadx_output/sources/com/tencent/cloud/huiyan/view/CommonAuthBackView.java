package com.tencent.cloud.huiyan.view;

/* loaded from: classes4.dex */
public class CommonAuthBackView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f45905d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Point f45906e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f45907f;

    public CommonAuthBackView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Point point = this.f45906e;
        canvas.drawCircle(point.x, point.y, this.f45905d, this.f45907f);
    }

    @Override // android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        android.graphics.Point point = this.f45906e;
        int i19 = size >> 1;
        point.x = i19;
        int i27 = size2 >> 1;
        point.y = i27;
        if (i19 > i27) {
            i19 = i27;
        }
        this.f45905d = i19;
        this.f45905d = i19 - java.lang.Math.round(getResources().getDisplayMetrics().density * 5.0f);
        setMeasuredDimension(size, size2);
    }

    public CommonAuthBackView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f45906e = new android.graphics.Point();
        this.f45907f = new android.graphics.Paint();
        this.f45907f.setPathEffect(new android.graphics.DashPathEffect(new float[]{java.lang.Math.round(getResources().getDisplayMetrics().density * 1.5f), java.lang.Math.round(getResources().getDisplayMetrics().density * 25.0f)}, java.lang.Math.round(getResources().getDisplayMetrics().density * 0.0f)));
        this.f45907f.setColor(getResources().getColor(com.tencent.mm.R.color.an8));
        this.f45907f.setStyle(android.graphics.Paint.Style.STROKE);
        this.f45907f.setStrokeWidth(java.lang.Math.round(getResources().getDisplayMetrics().density * 6.0f));
    }
}
