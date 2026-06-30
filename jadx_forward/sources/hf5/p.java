package hf5;

/* loaded from: classes11.dex */
public final class p implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.v f362801a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f362802b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f362803c;

    public p(gf5.v rule, hf5.h matcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matcher, "matcher");
        this.f362801a = rule;
        this.f362802b = matcher;
        this.f362803c = matcher.f362777b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362803c;
    }

    /* renamed from: equals */
    public boolean m133513xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.p)) {
            return false;
        }
        hf5.p pVar = (hf5.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362801a, pVar.f362801a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362802b, pVar.f362802b);
    }

    /* renamed from: hashCode */
    public int m133514x8cdac1b() {
        return (this.f362801a.m131500x8cdac1b() * 31) + this.f362802b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133515x9616526c() {
        return "PreparedPrefixedRule(rule=" + this.f362801a + ", matcher=" + this.f362802b + ')';
    }
}
