package hf5;

/* loaded from: classes11.dex */
public final class m implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.r f362793a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f362794b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f362795c;

    public m(gf5.r rule, hf5.h matcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matcher, "matcher");
        this.f362793a = rule;
        this.f362794b = matcher;
        this.f362795c = matcher.f362777b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362795c;
    }

    /* renamed from: equals */
    public boolean m133504xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.m)) {
            return false;
        }
        hf5.m mVar = (hf5.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362793a, mVar.f362793a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362794b, mVar.f362794b);
    }

    /* renamed from: hashCode */
    public int m133505x8cdac1b() {
        return (this.f362793a.m131488x8cdac1b() * 31) + this.f362794b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133506x9616526c() {
        return "PreparedLineMatchRule(rule=" + this.f362793a + ", matcher=" + this.f362794b + ')';
    }
}
