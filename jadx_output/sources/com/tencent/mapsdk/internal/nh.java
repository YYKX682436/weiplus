package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class nh<T extends com.tencent.mapsdk.internal.ni> implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.tencent.mapsdk.internal.tk f50568a;

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f50576i = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50569b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50570c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50571d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50572e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50573f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50574g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>> f50575h = new java.util.concurrent.ConcurrentHashMap();

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.tencentmap.mapsdk.maps.model.LatLng f50577a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f50578b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f50579c;

        public a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2) {
            this.f50577a = latLng;
            this.f50578b = str;
            this.f50579c = str2;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject
        public final java.lang.String getIdentifier() {
            return this.f50578b;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject
        public final java.lang.String getName() {
            return this.f50579c;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject
        public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
            return this.f50577a;
        }
    }

    public nh(com.tencent.mapsdk.internal.tk tkVar) {
        this.f50568a = tkVar;
    }

    private synchronized void g() {
        this.f50575h.clear();
        this.f50571d.clear();
        this.f50573f.clear();
        this.f50569b.clear();
    }

    public synchronized com.tencent.mapsdk.internal.ng<T> a(int i17) {
        return this.f50569b.get(java.lang.Integer.valueOf(i17));
    }

    public abstract com.tencent.mapsdk.internal.ng<T> a(T t17);

    public synchronized com.tencent.mapsdk.internal.ng<T> b(T t17) {
        com.tencent.mapsdk.internal.ng<T> a17;
        a17 = a((com.tencent.mapsdk.internal.nh<T>) t17);
        int incrementAndGet = this.f50576i.incrementAndGet();
        a17.f50564a = incrementAndGet;
        this.f50569b.put(java.lang.Integer.valueOf(incrementAndGet), a17);
        this.f50571d.put(java.lang.Integer.valueOf(a17.f50564a), a17);
        com.tencent.mapsdk.core.utils.log.LogUtil.a("BufferingElement add mNextAdds " + a17.f50564a + " size:" + this.f50571d.size() + " this:" + this);
        this.f50568a.i(true);
        return a17;
    }

    public void c() {
    }

    public abstract void c(com.tencent.mapsdk.internal.ng<T> ngVar);

    public final synchronized void d() {
        c();
        a(this.f50575h, this.f50574g);
        a(this.f50573f, this.f50572e);
        a(this.f50571d, this.f50570c);
        this.f50571d.clear();
        this.f50573f.clear();
        this.f50575h.clear();
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>>> it = this.f50570c.entrySet().iterator();
        while (it.hasNext()) {
            c(it.next().getValue());
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>>> it6 = this.f50572e.entrySet().iterator();
        while (it6.hasNext()) {
            d(it6.next().getValue());
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.tencent.mapsdk.internal.ng<T>>> it7 = this.f50574g.entrySet().iterator();
        while (it7.hasNext()) {
            e(it7.next().getValue());
        }
        this.f50574g.clear();
        this.f50572e.clear();
        this.f50570c.clear();
        e();
    }

    public abstract void d(com.tencent.mapsdk.internal.ng<T> ngVar);

    public void e() {
    }

    public abstract void e(com.tencent.mapsdk.internal.ng<T> ngVar);

    public abstract void f(com.tencent.mapsdk.internal.ng<T> ngVar);

    public boolean f() {
        return false;
    }

    public final synchronized void a(com.tencent.mapsdk.internal.ng<T> ngVar) {
        if (this.f50569b.get(java.lang.Integer.valueOf(ngVar.f50564a)) == null) {
            return;
        }
        this.f50573f.put(java.lang.Integer.valueOf(ngVar.f50564a), ngVar);
        this.f50568a.i(true);
    }

    public final android.content.Context a() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        if (tkVar == null) {
            return null;
        }
        return tkVar.A();
    }

    public final synchronized void b(com.tencent.mapsdk.internal.ng<T> ngVar) {
        f(ngVar);
        if (this.f50569b.get(java.lang.Integer.valueOf(ngVar.f50564a)) == null) {
            return;
        }
        if (this.f50571d.get(java.lang.Integer.valueOf(ngVar.f50564a)) == null) {
            this.f50575h.put(java.lang.Integer.valueOf(ngVar.f50564a), ngVar);
        }
        this.f50569b.remove(java.lang.Integer.valueOf(ngVar.f50564a));
        this.f50571d.remove(java.lang.Integer.valueOf(ngVar.f50564a));
        this.f50573f.remove(java.lang.Integer.valueOf(ngVar.f50564a));
        this.f50568a.i(true);
    }

    private static <A, B> void a(java.util.Map<A, B> map, java.util.Map<A, B> map2) {
        java.util.HashMap hashMap = new java.util.HashMap(map2);
        map2.clear();
        map2.putAll(map);
        map.clear();
        map.putAll(hashMap);
    }

    public android.util.Pair<com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject> a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, long j17, java.lang.String str, java.lang.String str2) {
        return new android.util.Pair<>(null, null);
    }

    public final synchronized void b() {
        g();
    }
}
