package hf5;

/* loaded from: classes11.dex */
public final class k implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.h f362783a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f362784b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f362785c;

    public k(gf5.h rule, hf5.h linePrefixMatcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linePrefixMatcher, "linePrefixMatcher");
        this.f362783a = rule;
        this.f362784b = linePrefixMatcher;
        java.util.Set set = linePrefixMatcher.f362777b;
        this.f362785c = set.isEmpty() ^ true ? set : null;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f362785c;
    }

    /* renamed from: equals */
    public boolean m133501xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.k)) {
            return false;
        }
        hf5.k kVar = (hf5.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362783a, kVar.f362783a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362784b, kVar.f362784b);
    }

    /* renamed from: hashCode */
    public int m133502x8cdac1b() {
        return (this.f362783a.m131473x8cdac1b() * 31) + this.f362784b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133503x9616526c() {
        return "PreparedKeyValueRule(rule=" + this.f362783a + ", linePrefixMatcher=" + this.f362784b + ')';
    }
}
