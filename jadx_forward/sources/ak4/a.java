package ak4;

/* loaded from: classes4.dex */
public final class a extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public static final int f87125f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        super.draw(canvas, charSequence, i17, i18, f17, i19, i27, i28, paint);
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        return super.getSize(paint, charSequence, i17, i18, fontMetricsInt) + f87125f;
    }
}
