package zo1;

/* loaded from: classes5.dex */
public final class z3 extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f556375d = (int) ((zo1.k4.f556203n.getTextSize() - zo1.k4.f556201i.getTextSize()) / 2.0f);

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint tp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tp6, "tp");
        tp6.baselineShift += this.f556375d;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint tp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tp6, "tp");
        tp6.baselineShift += this.f556375d;
    }
}
