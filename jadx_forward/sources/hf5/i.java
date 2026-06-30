package hf5;

/* loaded from: classes11.dex */
public final class i implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.a f362778a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f362779b;

    public i(gf5.a rule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        this.f362778a = rule;
        this.f362779b = kz5.o1.c(java.lang.Character.valueOf(r26.p0.A0(rule.f352899a)));
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362779b;
    }

    /* renamed from: equals */
    public boolean m133495xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5.i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362778a, ((hf5.i) obj).f362778a);
    }

    /* renamed from: hashCode */
    public int m133496x8cdac1b() {
        return this.f362778a.m131446x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m133497x9616526c() {
        return "PreparedDelimitedRule(rule=" + this.f362778a + ')';
    }
}
