package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes4.dex */
public final class sq extends android.text.style.ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
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
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
    }
}
