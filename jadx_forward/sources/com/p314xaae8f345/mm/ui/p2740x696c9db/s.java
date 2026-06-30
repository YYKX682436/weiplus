package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes4.dex */
public class s extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f292217a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f292218b;

    /* renamed from: c, reason: collision with root package name */
    public final int f292219c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f292220d;

    public s(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a, android.widget.EditText editText, java.lang.String str) {
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2.0f);
        this.f292219c = d17;
        android.graphics.Paint paint = new android.graphics.Paint(editText.getPaint());
        this.f292217a = paint;
        this.f292218b = str;
        paint.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
        float measureText = paint.measureText(str);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = d17 * 2;
        setBounds(0, 0, (int) (measureText + f17 + f17 + 2.0f), (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f292217a;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        android.graphics.Rect bounds = getBounds();
        int i17 = bounds.right;
        int i18 = bounds.left;
        android.graphics.RectF rectF = this.f292220d;
        float f17 = rectF.right;
        float f18 = rectF.left;
        int i19 = (bounds.bottom - bounds.top) - fontMetricsInt.bottom;
        int i27 = fontMetricsInt.top;
        canvas.drawText(this.f292218b, i18 + 2, (r4 + ((i19 + i27) / 2)) - i27, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        android.graphics.Paint.FontMetrics fontMetrics = this.f292217a.getFontMetrics();
        int i28 = this.f292219c;
        this.f292220d = new android.graphics.RectF(i17 + i28, i18 + (fontMetrics.ascent - fontMetrics.top), i19 - i28, i27);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
