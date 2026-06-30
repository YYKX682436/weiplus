package d2;

/* loaded from: classes14.dex */
public final class c extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f307283d;

    public c(float f17) {
        this.f307283d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f307283d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f307283d);
    }
}
