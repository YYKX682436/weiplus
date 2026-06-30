package d2;

/* loaded from: classes14.dex */
public final class d extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f307284d;

    public d(float f17) {
        this.f307284d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f307284d / textSize);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f307284d / textSize);
    }
}
