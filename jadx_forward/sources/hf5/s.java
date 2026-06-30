package hf5;

/* loaded from: classes11.dex */
public final class s implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.a0 f362807a;

    public s(gf5.a0 rule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        this.f362807a = rule;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return null;
    }

    /* renamed from: equals */
    public boolean m133519xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5.s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362807a, ((hf5.s) obj).f362807a);
    }

    /* renamed from: hashCode */
    public int m133520x8cdac1b() {
        return this.f362807a.m131449x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m133521x9616526c() {
        return "PreparedWordSetRule(rule=" + this.f362807a + ')';
    }
}
