package a6;

/* loaded from: classes14.dex */
public final class e implements a6.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final a6.d0 f1650b;

    public e(a6.d0 weakMemoryCache) {
        kotlin.jvm.internal.o.g(weakMemoryCache, "weakMemoryCache");
        this.f1650b = weakMemoryCache;
    }

    @Override // a6.a0
    public void a(int i17) {
    }

    @Override // a6.a0
    public a6.r b(coil.memory.MemoryCache$Key key) {
        kotlin.jvm.internal.o.g(key, "key");
        return null;
    }

    @Override // a6.a0
    public void c(coil.memory.MemoryCache$Key key, android.graphics.Bitmap bitmap, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f1650b.c(key, bitmap, z17, h6.a.a(bitmap));
    }
}
