package a0;

/* loaded from: classes14.dex */
public final class g0 implements a0.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.e5 f132d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e5 f133e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.e5 f134f;

    public g0(n0.e5 isPressed, n0.e5 isHovered, n0.e5 isFocused) {
        kotlin.jvm.internal.o.g(isPressed, "isPressed");
        kotlin.jvm.internal.o.g(isHovered, "isHovered");
        kotlin.jvm.internal.o.g(isFocused, "isFocused");
        this.f132d = isPressed;
        this.f133e = isHovered;
        this.f134f = isFocused;
    }

    @Override // a0.s1
    public void a(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        u1.o0 o0Var = (u1.o0) fVar;
        o0Var.b();
        if (((java.lang.Boolean) this.f132d.getValue()).booleanValue()) {
            int i17 = e1.y.f246321l;
            g1.h.h(fVar, e1.y.b(e1.y.f246311b, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, o0Var.a(), 0.0f, null, null, 0, 122, null);
        } else if (((java.lang.Boolean) this.f133e.getValue()).booleanValue() || ((java.lang.Boolean) this.f134f.getValue()).booleanValue()) {
            int i18 = e1.y.f246321l;
            g1.h.h(fVar, e1.y.b(e1.y.f246311b, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, o0Var.a(), 0.0f, null, null, 0, 122, null);
        }
    }
}
