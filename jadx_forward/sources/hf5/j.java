package hf5;

/* loaded from: classes11.dex */
public final class j implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.f f362780a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f362781b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f362782c;

    public j(gf5.f rule, hf5.h matcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matcher, "matcher");
        this.f362780a = rule;
        this.f362781b = matcher;
        this.f362782c = matcher.f362777b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362782c;
    }

    /* renamed from: equals */
    public boolean m133498xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.j)) {
            return false;
        }
        hf5.j jVar = (hf5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362780a, jVar.f362780a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362781b, jVar.f362781b);
    }

    /* renamed from: hashCode */
    public int m133499x8cdac1b() {
        return (this.f362780a.m131467x8cdac1b() * 31) + this.f362781b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133500x9616526c() {
        return "PreparedDiffLineRule(rule=" + this.f362780a + ", matcher=" + this.f362781b + ')';
    }
}
