package s20;

/* loaded from: classes5.dex */
public final class e extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f483811d;

    public e(int i17) {
        this.f483811d = i17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        return this.f483811d;
    }
}
