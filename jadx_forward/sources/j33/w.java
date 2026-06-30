package j33;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f378993a;

    /* renamed from: b, reason: collision with root package name */
    public final k33.d f378994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f378995c;

    /* renamed from: d, reason: collision with root package name */
    public final int f378996d;

    /* renamed from: e, reason: collision with root package name */
    public final int f378997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f378998f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f378999g;

    public w(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, k33.d scrollerView, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollerView, "scrollerView");
        this.f378993a = recyclerView;
        this.f378994b = scrollerView;
        this.f378995c = i17;
        this.f378996d = i18;
        this.f378997e = i19;
        this.f378998f = i27;
        this.f378999g = jz5.h.b(new j33.v(this));
    }

    public final float a(float f17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f378993a;
        float min = java.lang.Math.min(1.0f, c1163xf1deaba4.computeVerticalScrollOffset() / (c1163xf1deaba4.computeVerticalScrollRange() - c1163xf1deaba4.getHeight()));
        c1163xf1deaba4.getHeight();
        return f17 * min;
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.f378999g).mo141623x754a37bb()).intValue();
    }
}
