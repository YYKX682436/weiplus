package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes13.dex */
public final class r0 extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f274885f;

    /* renamed from: g, reason: collision with root package name */
    public final int f274886g;

    /* renamed from: h, reason: collision with root package name */
    public final int f274887h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f274888i;

    /* renamed from: m, reason: collision with root package name */
    public int f274889m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f274890n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.graphics.drawable.Drawable drawable, boolean z17, int i17, int i18) {
        super(drawable, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f274885f = z17;
        this.f274886g = i17;
        this.f274887h = i18;
        this.f274888i = new android.graphics.RectF();
        this.f274889m = 255;
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int abs = java.lang.Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent);
        if (abs != drawable.getBounds().width()) {
            drawable.setBounds(0, 0, abs, abs);
        }
        float f18 = ((i27 + fontMetricsInt.descent) - (r4 / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2.0f);
        canvas.translate(f17, f18);
        this.f274888i.set(f17, f18, drawable.getBounds().width() + f17, drawable.getBounds().height() + f18);
        int alpha = drawable.getAlpha();
        int alpha2 = this.f274890n ? this.f274889m : paint.getAlpha();
        if (alpha2 == 0 && alpha != alpha2) {
            drawable.setAlpha(alpha2);
        }
        drawable.draw(canvas);
        drawable.setAlpha(alpha);
        canvas.restore();
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.Rect bounds = drawable.getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "getBounds(...)");
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int width = bounds.width();
        if (fontMetricsInt2 != null) {
            int abs = java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
            drawable.setBounds(0, 0, abs, abs);
            width = drawable.getBounds().width();
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
            }
        }
        return width;
    }
}
