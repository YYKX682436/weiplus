package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes4.dex */
public class td extends android.graphics.drawable.Drawable {

    /* renamed from: h, reason: collision with root package name */
    public static int f292314h;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f292315a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f292316b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f292317c;

    /* renamed from: d, reason: collision with root package name */
    public final float f292318d;

    /* renamed from: e, reason: collision with root package name */
    public final float f292319e;

    /* renamed from: f, reason: collision with root package name */
    public float f292320f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f292321g;

    public td(android.content.Context context, java.lang.String str, android.graphics.Paint paint) {
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f292315a = paint2;
        paint2.setColor(-7829368);
        this.f292316b = paint;
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 2.0f);
        f292314h = d17;
        float f17 = d17;
        this.f292318d = f17;
        this.f292319e = f17;
        this.f292317c = str;
        this.f292320f = paint.measureText(str);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float ceil = (float) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        float f18 = this.f292320f;
        float f19 = f292314h * 2;
        setBounds(0, 0, (int) (f18 + f19 + f19), (int) ceil);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextDrawable", "setText(%s).", str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        canvas.drawRoundRect(this.f292321g, this.f292318d, this.f292319e, this.f292315a);
        android.graphics.Rect bounds = getBounds();
        float f17 = bounds.right - bounds.left;
        android.graphics.RectF rectF = this.f292321g;
        int i17 = (int) (((f17 - (rectF.right - rectF.left)) + (f292314h * 2)) / 2.0f);
        android.graphics.Paint paint = this.f292316b;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i18 = (bounds.bottom - bounds.top) - fontMetricsInt.bottom;
        int i19 = fontMetricsInt.top;
        canvas.drawText(this.f292317c, i17, (r4 + ((i18 + i19) / 2)) - i19, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f292315a.getAlpha() < 255 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.Paint paint = this.f292315a;
        if (i17 != paint.getAlpha()) {
            paint.setAlpha(i17);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        android.graphics.Paint.FontMetrics fontMetrics = this.f292316b.getFontMetrics();
        int i28 = f292314h;
        this.f292321g = new android.graphics.RectF(i17 + i28, i18 + (fontMetrics.ascent - fontMetrics.top), i19 - i28, i27);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f292315a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
