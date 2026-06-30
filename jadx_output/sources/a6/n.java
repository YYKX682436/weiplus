package a6;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final s5.c f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.a0 f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final a6.d0 f1673c;

    public n(s5.c referenceCounter, a6.a0 strongMemoryCache, a6.d0 weakMemoryCache) {
        kotlin.jvm.internal.o.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.o.g(strongMemoryCache, "strongMemoryCache");
        kotlin.jvm.internal.o.g(weakMemoryCache, "weakMemoryCache");
        this.f1671a = referenceCounter;
        this.f1672b = strongMemoryCache;
        this.f1673c = weakMemoryCache;
    }

    public final a6.r a(coil.memory.MemoryCache$Key memoryCache$Key) {
        if (memoryCache$Key == null) {
            return null;
        }
        a6.r b17 = this.f1672b.b(memoryCache$Key);
        if (b17 == null) {
            b17 = this.f1673c.b(memoryCache$Key);
        }
        if (b17 != null) {
            this.f1671a.c(b17.getBitmap());
        }
        return b17;
    }
}
