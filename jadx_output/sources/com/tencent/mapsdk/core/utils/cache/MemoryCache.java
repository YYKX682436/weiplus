package com.tencent.mapsdk.core.utils.cache;

/* loaded from: classes13.dex */
public final class MemoryCache<D extends com.tencent.mapsdk.internal.jz> extends com.tencent.mapsdk.internal.kg<D> {

    /* renamed from: a, reason: collision with root package name */
    private static final float f48735a = 0.9f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f48736b = 0.15f;

    /* renamed from: e, reason: collision with root package name */
    private static int f48737e = 104857600;

    /* renamed from: f, reason: collision with root package name */
    private static final float f48738f = 0.8f;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.mapsdk.core.utils.cache.MemoryCache.a f48739c;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ka.a<D> f48740d;

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.jy.a {

        /* renamed from: b, reason: collision with root package name */
        public int f48741b;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.mapsdk.internal.jy.b f48742c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f48743d;

        /* renamed from: e, reason: collision with root package name */
        int f48744e;

        public a(int i17) {
            this.f48744e = i17;
        }

        private <D> com.tencent.mapsdk.internal.jy.b<D> c() {
            return this.f48742c;
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final boolean b() {
            return this.f48743d;
        }

        public final java.lang.String toString() {
            return "Options{mMaxCacheSize=" + this.f48741b + '}';
        }

        private com.tencent.mapsdk.core.utils.cache.MemoryCache.a a(boolean z17) {
            this.f48743d = z17;
            return this;
        }

        private com.tencent.mapsdk.core.utils.cache.MemoryCache.a a(int i17) {
            this.f48741b = i17;
            return this;
        }

        private <D> com.tencent.mapsdk.core.utils.cache.MemoryCache.a a(com.tencent.mapsdk.internal.jy.b<D> bVar) {
            this.f48742c = bVar;
            return this;
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final int a() {
            return this.f48741b;
        }
    }

    public MemoryCache(com.tencent.mapsdk.core.utils.cache.MemoryCache.a aVar) {
        this.f48739c = aVar;
        this.f48740d = new com.tencent.mapsdk.internal.ka.a<>(a(), aVar.f48742c);
        if (aVar.f48743d) {
            return;
        }
        f48737e = java.lang.Math.min(f48737e, a());
    }

    private int a() {
        int i17 = (int) (((float) java.lang.Runtime.getRuntime().totalMemory()) * f48735a);
        int freeMemory = (int) (((float) java.lang.Runtime.getRuntime().freeMemory()) * f48736b);
        com.tencent.mapsdk.core.utils.cache.MemoryCache.a aVar = this.f48739c;
        return aVar != null ? java.lang.Math.min(java.lang.Math.max(aVar.f48741b, freeMemory), i17) : i17;
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final void b() {
        this.f48740d.a();
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final long c() {
        return this.f48740d.d().size();
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final long d() {
        return this.f48740d.b();
    }

    @Override // com.tencent.mapsdk.internal.jy, com.tencent.mapsdk.internal.kf
    public final long e() {
        return this.f48740d.c();
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final void a(java.lang.String str, D d17) {
        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50217r, str, this.f48739c.f48744e);
        if (this.f48739c.f48743d && this.f48740d.b() >= this.f48740d.c() * f48738f && this.f48740d.b() < f48737e) {
            this.f48740d.a((int) java.lang.Math.min(r0.c() * 1.8f, f48737e));
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50217r, "MemoryCache expanding mDataSize:[" + this.f48740d.b() + "] maxDataSize:[" + this.f48740d.c() + "]");
        }
        this.f48740d.a((com.tencent.mapsdk.internal.ka.a<D>) str, (java.lang.String) d17);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50217r, str, (java.lang.Object) "put data length", d17.a());
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final D a(java.lang.String str, java.lang.Class<D> cls) {
        D d17 = (D) this.f48740d.b((com.tencent.mapsdk.internal.ka.a<D>) str);
        if (this.f48739c.f48743d && this.f48740d.b() <= this.f48740d.c() / 1.8f && this.f48740d.b() > a()) {
            this.f48740d.a((int) (r0.c() / 1.8f));
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50217r, "MemoryCache shrinking mDataSize:[" + this.f48740d.b() + "] maxDataSize:[" + this.f48740d.c() + "]");
        }
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50217r, str, (java.lang.Object) "get data length", d17 == null ? 0 : d17.a());
        com.tencent.mapsdk.internal.lb.f(com.tencent.mapsdk.internal.kx.f50217r, str, this.f48739c.f48744e);
        return d17;
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final boolean a(java.lang.String str) {
        return this.f48740d.c(str) != 0;
    }
}
