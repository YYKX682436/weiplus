package d2;

/* loaded from: classes14.dex */
public class i extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f307309d;

    public i(float f17) {
        this.f307309d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f307309d + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f307309d + textPaint.getTextSkewX());
    }
}
