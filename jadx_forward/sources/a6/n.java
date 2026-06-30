package a6;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final s5.c f83204a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.a0 f83205b;

    /* renamed from: c, reason: collision with root package name */
    public final a6.d0 f83206c;

    public n(s5.c referenceCounter, a6.a0 strongMemoryCache, a6.d0 weakMemoryCache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referenceCounter, "referenceCounter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strongMemoryCache, "strongMemoryCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakMemoryCache, "weakMemoryCache");
        this.f83204a = referenceCounter;
        this.f83205b = strongMemoryCache;
        this.f83206c = weakMemoryCache;
    }

    public final a6.r a(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc abstractC1415x223acdfc) {
        if (abstractC1415x223acdfc == null) {
            return null;
        }
        a6.r b17 = this.f83205b.b(abstractC1415x223acdfc);
        if (b17 == null) {
            b17 = this.f83206c.b(abstractC1415x223acdfc);
        }
        if (b17 != null) {
            this.f83204a.c(b17.mo721x12501425());
        }
        return b17;
    }
}
