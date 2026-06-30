package df5;

/* loaded from: classes5.dex */
public final class r0 extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f313730d;

    public r0(int i17) {
        this.f313730d = i17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence text, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        return this.f313730d;
    }
}
