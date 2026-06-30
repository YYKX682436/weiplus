package d2;

/* loaded from: classes14.dex */
public final class b extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f307282d;

    public b(java.lang.String fontFeatureSettings) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontFeatureSettings, "fontFeatureSettings");
        this.f307282d = fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f307282d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f307282d);
    }
}
