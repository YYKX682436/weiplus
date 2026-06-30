package a6;

/* loaded from: classes14.dex */
public final class v implements a6.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final a6.d0 f1698b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.c f1699c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.u f1700d;

    public v(a6.d0 weakMemoryCache, s5.c referenceCounter, int i17, h6.k kVar) {
        kotlin.jvm.internal.o.g(weakMemoryCache, "weakMemoryCache");
        kotlin.jvm.internal.o.g(referenceCounter, "referenceCounter");
        this.f1698b = weakMemoryCache;
        this.f1699c = referenceCounter;
        this.f1700d = new a6.u(this, i17);
    }

    @Override // a6.a0
    public synchronized void a(int i17) {
        if (i17 >= 40) {
            synchronized (this) {
                this.f1700d.trimToSize(-1);
            }
        } else {
            boolean z17 = false;
            if (10 <= i17 && i17 < 20) {
                z17 = true;
            }
            if (z17) {
                a6.u uVar = this.f1700d;
                uVar.trimToSize(uVar.size() / 2);
            }
        }
    }

    @Override // a6.a0
    public synchronized a6.r b(coil.memory.MemoryCache$Key key) {
        kotlin.jvm.internal.o.g(key, "key");
        return (a6.r) this.f1700d.get(key);
    }

    @Override // a6.a0
    public synchronized void c(coil.memory.MemoryCache$Key key, android.graphics.Bitmap bitmap, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        int a17 = h6.a.a(bitmap);
        if (a17 > this.f1700d.maxSize()) {
            if (((a6.t) this.f1700d.remove(key)) == null) {
                this.f1698b.c(key, bitmap, z17, a17);
            }
        } else {
            this.f1699c.c(bitmap);
            this.f1700d.put(key, new a6.t(bitmap, z17, a17));
        }
    }
}
