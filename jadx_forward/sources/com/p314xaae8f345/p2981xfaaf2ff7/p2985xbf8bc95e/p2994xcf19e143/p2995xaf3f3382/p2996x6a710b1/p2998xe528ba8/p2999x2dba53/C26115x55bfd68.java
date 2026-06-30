package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator */
/* loaded from: classes13.dex */
public class C26115x55bfd68<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> f296992a;

    /* renamed from: b, reason: collision with root package name */
    public final x.g f296993b = new x.g(5);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f296994c = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator$PrecacheRunnable */
    /* loaded from: classes13.dex */
    public class PrecacheRunnable implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f296995a;

        public PrecacheRunnable(int i17) {
            this.f296995a = i17;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.Thread.sleep((long) ((java.lang.Math.random() * 500.0d) + 500.0d));
            } catch (java.lang.InterruptedException unused) {
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68.this.a(this.f296995a);
        }
    }

    public C26115x55bfd68(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> interfaceC26112x84e2d44f) {
        this.f296992a = interfaceC26112x84e2d44f;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: addItem */
    public void mo100153xbb852f54(T t17) {
        this.f296992a.mo100153xbb852f54(t17);
        a();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: addItems */
    public void mo100154xb520bb9f(java.util.Collection<T> collection) {
        this.f296992a.mo100154xb520bb9f(collection);
        a();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: clearItems */
    public void mo100155xd31c2973() {
        this.f296992a.mo100155xd31c2973();
        a();
    }

    /* renamed from: getAlgorithm */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f m100164xcde25b9() {
        return this.f296992a;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: getClusters */
    public java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> mo100156xc7416b2f(double d17) {
        int i17 = (int) d17;
        java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> a17 = a(i17);
        int i18 = i17 + 1;
        if (this.f296993b.get(java.lang.Integer.valueOf(i18)) == null) {
            new java.lang.Thread(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68.PrecacheRunnable(i18)).start();
        }
        int i19 = i17 - 1;
        if (this.f296993b.get(java.lang.Integer.valueOf(i19)) == null) {
            new java.lang.Thread(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68.PrecacheRunnable(i19)).start();
        }
        return a17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: getItems */
    public java.util.Collection<T> mo100157x749b8e0a() {
        return this.f296992a.mo100157x749b8e0a();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f
    /* renamed from: removeItem */
    public void mo100158x417605b7(T t17) {
        this.f296992a.mo100158x417605b7(t17);
        a();
    }

    public final void a() {
        this.f296993b.m174735x16cbb098();
    }

    public final java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> a(int i17) {
        this.f296994c.readLock().lock();
        java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> set = (java.util.Set) this.f296993b.get(java.lang.Integer.valueOf(i17));
        this.f296994c.readLock().unlock();
        if (set == null) {
            this.f296994c.writeLock().lock();
            set = (java.util.Set) this.f296993b.get(java.lang.Integer.valueOf(i17));
            if (set == null) {
                set = this.f296992a.mo100156xc7416b2f(i17);
                this.f296993b.put(java.lang.Integer.valueOf(i17), set);
            }
            this.f296994c.writeLock().unlock();
        }
        return set;
    }
}
