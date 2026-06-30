package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82;

/* renamed from: com.tencent.mapsdk.core.utils.cache.MemoryCache */
/* loaded from: classes13.dex */
public final class C4384xb667a2e1<D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kg<D> {

    /* renamed from: a, reason: collision with root package name */
    private static final float f130268a = 0.9f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f130269b = 0.15f;

    /* renamed from: e, reason: collision with root package name */
    private static int f130270e = 104857600;

    /* renamed from: f, reason: collision with root package name */
    private static final float f130271f = 0.8f;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a f130272c;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ka.a<D> f130273d;

    /* renamed from: com.tencent.mapsdk.core.utils.cache.MemoryCache$a */
    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.jy.a {

        /* renamed from: b, reason: collision with root package name */
        public int f130274b;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.mapsdk.internal.jy.b f130275c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f130276d;

        /* renamed from: e, reason: collision with root package name */
        int f130277e;

        public a(int i17) {
            this.f130277e = i17;
        }

        private <D> com.tencent.mapsdk.internal.jy.b<D> c() {
            return this.f130275c;
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final boolean b() {
            return this.f130276d;
        }

        /* renamed from: toString */
        public final java.lang.String m36138x9616526c() {
            return "Options{mMaxCacheSize=" + this.f130274b + '}';
        }

        private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a a(boolean z17) {
            this.f130276d = z17;
            return this;
        }

        private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a a(int i17) {
            this.f130274b = i17;
            return this;
        }

        private <D> com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a a(com.tencent.mapsdk.internal.jy.b<D> bVar) {
            this.f130275c = bVar;
            return this;
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final int a() {
            return this.f130274b;
        }
    }

    public C4384xb667a2e1(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a aVar) {
        this.f130272c = aVar;
        this.f130273d = new com.tencent.mapsdk.internal.ka.a<>(a(), aVar.f130275c);
        if (aVar.f130276d) {
            return;
        }
        f130270e = java.lang.Math.min(f130270e, a());
    }

    private int a() {
        int i17 = (int) (((float) java.lang.Runtime.getRuntime().totalMemory()) * f130268a);
        int freeMemory = (int) (((float) java.lang.Runtime.getRuntime().freeMemory()) * f130269b);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a aVar = this.f130272c;
        return aVar != null ? java.lang.Math.min(java.lang.Math.max(aVar.f130274b, freeMemory), i17) : i17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final void b() {
        this.f130273d.a();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final long c() {
        return this.f130273d.d().size();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final long d() {
        return this.f130273d.b();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final long e() {
        return this.f130273d.c();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final void a(java.lang.String str, D d17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131750r, str, this.f130272c.f130277e);
        if (this.f130272c.f130276d && this.f130273d.b() >= this.f130273d.c() * f130271f && this.f130273d.b() < f130270e) {
            this.f130273d.a((int) java.lang.Math.min(r0.c() * 1.8f, f130270e));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131750r, "MemoryCache expanding mDataSize:[" + this.f130273d.b() + "] maxDataSize:[" + this.f130273d.c() + "]");
        }
        this.f130273d.a((com.tencent.mapsdk.internal.ka.a<D>) str, (java.lang.String) d17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131750r, str, (java.lang.Object) "put data length", d17.a());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final D a(java.lang.String str, java.lang.Class<D> cls) {
        D d17 = (D) this.f130273d.b((com.tencent.mapsdk.internal.ka.a<D>) str);
        if (this.f130272c.f130276d && this.f130273d.b() <= this.f130273d.c() / 1.8f && this.f130273d.b() > a()) {
            this.f130273d.a((int) (r0.c() / 1.8f));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131750r, "MemoryCache shrinking mDataSize:[" + this.f130273d.b() + "] maxDataSize:[" + this.f130273d.c() + "]");
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131750r, str, (java.lang.Object) "get data length", d17 == null ? 0 : d17.a());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131750r, str, this.f130272c.f130277e);
        return d17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final boolean a(java.lang.String str) {
        return this.f130273d.c(str) != 0;
    }
}
