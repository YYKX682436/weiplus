package a0;

/* loaded from: classes14.dex */
public final class g0 implements a0.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.e5 f81665d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e5 f81666e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.e5 f81667f;

    public g0(n0.e5 isPressed, n0.e5 isHovered, n0.e5 isFocused) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isPressed, "isPressed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isHovered, "isHovered");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isFocused, "isFocused");
        this.f81665d = isPressed;
        this.f81666e = isHovered;
        this.f81667f = isFocused;
    }

    @Override // a0.s1
    public void a(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        u1.o0 o0Var = (u1.o0) fVar;
        o0Var.b();
        if (((java.lang.Boolean) this.f81665d.mo128745x754a37bb()).booleanValue()) {
            int i17 = e1.y.f327854l;
            g1.h.h(fVar, e1.y.b(e1.y.f327844b, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, o0Var.a(), 0.0f, null, null, 0, 122, null);
        } else if (((java.lang.Boolean) this.f81666e.mo128745x754a37bb()).booleanValue() || ((java.lang.Boolean) this.f81667f.mo128745x754a37bb()).booleanValue()) {
            int i18 = e1.y.f327854l;
            g1.h.h(fVar, e1.y.b(e1.y.f327844b, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, o0Var.a(), 0.0f, null, null, 0, 122, null);
        }
    }
}
