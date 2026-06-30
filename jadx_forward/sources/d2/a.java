package d2;

/* loaded from: classes5.dex */
public class a extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f307281d;

    public a(float f17) {
        this.f307281d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.f307281d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.f307281d);
    }
}
