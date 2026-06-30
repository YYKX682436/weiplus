package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes4.dex */
public final class sq extends android.text.style.ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f18 = ((((i27 * 2) + fontMetrics.ascent) + fontMetrics.descent) / 2) - ((getDrawable().getBounds().bottom + getDrawable().getBounds().top) / 2);
        canvas.save();
        canvas.translate(f17, f18);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(android.content.Context context, android.graphics.Bitmap bitmap) {
        super(context, bitmap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
    }
}
