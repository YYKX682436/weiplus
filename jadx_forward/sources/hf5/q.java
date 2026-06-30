package hf5;

/* loaded from: classes11.dex */
public final class q implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.w f362804a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f362805b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f362806c;

    public q(gf5.w rule, hf5.h matcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matcher, "matcher");
        this.f362804a = rule;
        this.f362805b = matcher;
        this.f362806c = matcher.f362777b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362806c;
    }

    /* renamed from: equals */
    public boolean m133516xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.q)) {
            return false;
        }
        hf5.q qVar = (hf5.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362804a, qVar.f362804a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362805b, qVar.f362805b);
    }

    /* renamed from: hashCode */
    public int m133517x8cdac1b() {
        return (this.f362804a.m131503x8cdac1b() * 31) + this.f362805b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133518x9616526c() {
        return "PreparedPreprocessorRule(rule=" + this.f362804a + ", matcher=" + this.f362805b + ')';
    }
}
