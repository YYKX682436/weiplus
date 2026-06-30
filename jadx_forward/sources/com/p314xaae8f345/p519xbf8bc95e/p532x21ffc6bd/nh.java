package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class nh<T extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni> implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk f132101a;

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f132109i = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132102b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132103c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132104d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132105e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132106f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132107g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    protected final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>> f132108h = new java.util.concurrent.ConcurrentHashMap();

    /* loaded from: classes13.dex */
    public static class a implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f132110a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f132111b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f132112c;

        public a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, java.lang.String str, java.lang.String str2) {
            this.f132110a = c26041x873d1d26;
            this.f132111b = str;
            this.f132112c = str2;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject
        /* renamed from: getIdentifier */
        public final java.lang.String mo36850x8dc9649f() {
            return this.f132111b;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject
        /* renamed from: getName */
        public final java.lang.String mo36851xfb82e301() {
            return this.f132112c;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject
        /* renamed from: getPosition */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo36852xa86cd69f() {
            return this.f132110a;
        }
    }

    public nh(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar) {
        this.f132101a = tkVar;
    }

    private synchronized void g() {
        this.f132108h.clear();
        this.f132104d.clear();
        this.f132106f.clear();
        this.f132102b.clear();
    }

    public synchronized com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> a(int i17) {
        return this.f132102b.get(java.lang.Integer.valueOf(i17));
    }

    public abstract com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> a(T t17);

    public synchronized com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> b(T t17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> a17;
        a17 = a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<T>) t17);
        int incrementAndGet = this.f132109i.incrementAndGet();
        a17.f132097a = incrementAndGet;
        this.f132102b.put(java.lang.Integer.valueOf(incrementAndGet), a17);
        this.f132104d.put(java.lang.Integer.valueOf(a17.f132097a), a17);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a("BufferingElement add mNextAdds " + a17.f132097a + " size:" + this.f132104d.size() + " this:" + this);
        this.f132101a.i(true);
        return a17;
    }

    public void c() {
    }

    public abstract void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> ngVar);

    public final synchronized void d() {
        c();
        a(this.f132108h, this.f132107g);
        a(this.f132106f, this.f132105e);
        a(this.f132104d, this.f132103c);
        this.f132104d.clear();
        this.f132106f.clear();
        this.f132108h.clear();
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>>> it = this.f132103c.entrySet().iterator();
        while (it.hasNext()) {
            c(it.next().getValue());
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>>> it6 = this.f132105e.entrySet().iterator();
        while (it6.hasNext()) {
            d(it6.next().getValue());
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T>>> it7 = this.f132107g.entrySet().iterator();
        while (it7.hasNext()) {
            e(it7.next().getValue());
        }
        this.f132107g.clear();
        this.f132105e.clear();
        this.f132103c.clear();
        e();
    }

    public abstract void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> ngVar);

    public void e() {
    }

    public abstract void e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> ngVar);

    public abstract void f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> ngVar);

    public boolean f() {
        return false;
    }

    public final synchronized void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> ngVar) {
        if (this.f132102b.get(java.lang.Integer.valueOf(ngVar.f132097a)) == null) {
            return;
        }
        this.f132106f.put(java.lang.Integer.valueOf(ngVar.f132097a), ngVar);
        this.f132101a.i(true);
    }

    public final android.content.Context a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
        if (tkVar == null) {
            return null;
        }
        return tkVar.A();
    }

    public final synchronized void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<T> ngVar) {
        f(ngVar);
        if (this.f132102b.get(java.lang.Integer.valueOf(ngVar.f132097a)) == null) {
            return;
        }
        if (this.f132104d.get(java.lang.Integer.valueOf(ngVar.f132097a)) == null) {
            this.f132108h.put(java.lang.Integer.valueOf(ngVar.f132097a), ngVar);
        }
        this.f132102b.remove(java.lang.Integer.valueOf(ngVar.f132097a));
        this.f132104d.remove(java.lang.Integer.valueOf(ngVar.f132097a));
        this.f132106f.remove(java.lang.Integer.valueOf(ngVar.f132097a));
        this.f132101a.i(true);
    }

    private static <A, B> void a(java.util.Map<A, B> map, java.util.Map<A, B> map2) {
        java.util.HashMap hashMap = new java.util.HashMap(map2);
        map2.clear();
        map2.putAll(map);
        map.clear();
        map.putAll(hashMap);
    }

    public android.util.Pair<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject> a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, long j17, java.lang.String str, java.lang.String str2) {
        return new android.util.Pair<>(null, null);
    }

    public final synchronized void b() {
        g();
    }
}
