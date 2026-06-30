package com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f298177a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f298178b;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f298181e;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f298179c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f298180d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f298182f = true;

    public final java.lang.Object a(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        this.f298181e = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.h(nVar);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l.f298184c.a();
        int i17 = this.f298177a;
        boolean z18 = this.f298178b;
        boolean z19 = this.f298182f;
        a17.getClass();
        a17.f298186a.put(java.lang.Integer.valueOf(i17), this);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.n nVar2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.n.f298188b;
        nVar2.f298189a.m112334x9db8edf9(nVar2.f60634xf042a733, i17, z17, z18, z19);
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a18;
    }

    public final boolean b() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l.f298184c.a();
        int i17 = this.f298177a;
        a17.getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.n nVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.n.f298188b;
        return nVar.f298189a.m112336x9db8edfb(nVar.f60634xf042a733, i17);
    }

    public final void c() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.k kVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l.f298184c;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l a17 = kVar.a();
        int i17 = this.f298177a;
        a17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f298186a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(concurrentHashMap.get(java.lang.Integer.valueOf(i17)), this)) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a17.f298187b;
        if (((java.lang.Integer) concurrentHashMap2.get(java.lang.Integer.valueOf(i17))) != null) {
            concurrentHashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r3.intValue() - 1));
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l a18 = kVar.a();
        int i18 = this.f298177a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = a18.f298187b;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap3.get(java.lang.Integer.valueOf(i18));
        if (num != null && num.intValue() == 0) {
            concurrentHashMap3.remove(java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.n nVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.n.f298188b;
            nVar.f298189a.m112337x9db8edfc(nVar.f60634xf042a733, i18);
        }
    }

    public final void d(int i17) {
        if (this.f298177a == i17) {
            return;
        }
        this.f298177a = i17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l.f298184c.a();
        int i18 = this.f298177a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f298187b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
        concurrentHashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }
}
