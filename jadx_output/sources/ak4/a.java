package ak4;

/* loaded from: classes4.dex */
public final class a extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public static final int f5592f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        super.draw(canvas, charSequence, i17, i18, f17, i19, i27, i28, paint);
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        return super.getSize(paint, charSequence, i17, i18, fontMetricsInt) + f5592f;
    }
}
