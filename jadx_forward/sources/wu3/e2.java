package wu3;

/* loaded from: classes3.dex */
public final class e2 extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f531265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.graphics.drawable.Drawable drawable) {
        super(drawable, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        java.lang.ref.WeakReference weakReference = this.f531265f;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f531265f = new java.lang.ref.WeakReference(drawable);
        }
        if (drawable != null) {
            canvas.save();
            canvas.translate(f17, (i28 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        java.lang.ref.WeakReference weakReference = this.f531265f;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f531265f = new java.lang.ref.WeakReference(drawable);
        }
        android.graphics.Rect bounds = drawable != null ? drawable.getBounds() : null;
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        if (bounds != null) {
            return bounds.right;
        }
        return 0;
    }
}
