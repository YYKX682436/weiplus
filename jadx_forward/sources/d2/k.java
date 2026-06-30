package d2;

/* loaded from: classes14.dex */
public final class k extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Typeface f307312d;

    public k(android.graphics.Typeface typeface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeface, "typeface");
        this.f307312d = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setTypeface(this.f307312d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        paint.setTypeface(this.f307312d);
    }
}
