package hf5;

/* loaded from: classes11.dex */
public final class o implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.u f362798a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f362799b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f362800c;

    public o(gf5.u rule, hf5.h matcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matcher, "matcher");
        this.f362798a = rule;
        this.f362799b = matcher;
        this.f362800c = matcher.f362777b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362800c;
    }

    /* renamed from: equals */
    public boolean m133510xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.o)) {
            return false;
        }
        hf5.o oVar = (hf5.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362798a, oVar.f362798a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362799b, oVar.f362799b);
    }

    /* renamed from: hashCode */
    public int m133511x8cdac1b() {
        return (this.f362798a.m131497x8cdac1b() * 31) + this.f362799b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133512x9616526c() {
        return "PreparedOperatorRule(rule=" + this.f362798a + ", matcher=" + this.f362799b + ')';
    }
}
