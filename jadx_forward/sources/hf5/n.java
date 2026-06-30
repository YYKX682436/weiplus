package hf5;

/* loaded from: classes11.dex */
public final class n implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.s f362796a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f362797b;

    public n(gf5.s rule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        this.f362796a = rule;
        this.f362797b = kz5.o1.c(java.lang.Character.valueOf(r26.p0.A0(rule.f352976a)));
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362797b;
    }

    /* renamed from: equals */
    public boolean m133507xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5.n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362796a, ((hf5.n) obj).f362796a);
    }

    /* renamed from: hashCode */
    public int m133508x8cdac1b() {
        return this.f362796a.m131491x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m133509x9616526c() {
        return "PreparedMarkupRule(rule=" + this.f362796a + ')';
    }
}
