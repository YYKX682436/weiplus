package df5;

/* loaded from: classes11.dex */
public final class u0 extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f313752d;

    public u0(float f17) {
        this.f313752d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        com.p314xaae8f345.mm.ui.bk.r0(paint, this.f313752d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        com.p314xaae8f345.mm.ui.bk.r0(paint, this.f313752d);
    }
}
