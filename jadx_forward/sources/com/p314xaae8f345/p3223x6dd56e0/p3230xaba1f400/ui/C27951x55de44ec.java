package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout */
/* loaded from: classes14.dex */
public class C27951x55de44ec extends android.widget.RelativeLayout {
    private static java.lang.String TAG = "YTReflectLayout";

    /* renamed from: mColorMatrixColorFilter */
    private android.graphics.ColorMatrixColorFilter f62554xae463de4;

    /* renamed from: mPaint */
    private android.graphics.Paint f62555xbe9543f1;

    /* renamed from: mRect */
    private android.graphics.Rect f62556x626cff1;

    public C27951x55de44ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62556x626cff1 = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62555xbe9543f1 = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f62555xbe9543f1.setColor(android.graphics.Color.argb(200, 0, 0, 0));
        this.f62554xae463de4 = new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.f62555xbe9543f1.setColorFilter(this.f62554xae463de4);
        this.f62556x626cff1.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.f62556x626cff1, this.f62555xbe9543f1);
    }

    /* renamed from: setColorMatrixColorFilter */
    public void mo63489x83f16419(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        this.f62554xae463de4 = colorMatrixColorFilter;
        invalidate();
    }
}
