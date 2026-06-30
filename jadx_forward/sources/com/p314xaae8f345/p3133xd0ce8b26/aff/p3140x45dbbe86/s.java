package com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f298196a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f298197b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f298198c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f298199d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f298200e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f298201f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f298202g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f298203h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f298204i = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f298205j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f298206k;

    public final java.lang.Object a(bw5.ia designerType, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.q(nVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(designerType, "designerType");
        this.f298206k = qVar;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a();
        int i17 = this.f298196a;
        a17.getClass();
        a17.f298210a.put(java.lang.Integer.valueOf(i17), this);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
        wVar.f298213a.m112355x9db8edfa(wVar.f60634xf042a733, i17, designerType.f110043d, z17);
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a18;
    }

    public final void b() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.u uVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v a17 = uVar.a();
        int i17 = this.f298196a;
        a17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f298210a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(concurrentHashMap.get(java.lang.Integer.valueOf(i17)), this)) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a17.f298211b;
        if (((java.lang.Integer) concurrentHashMap2.get(java.lang.Integer.valueOf(i17))) != null) {
            concurrentHashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r3.intValue() - 1));
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v a18 = uVar.a();
        int i18 = this.f298196a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = a18.f298211b;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap3.get(java.lang.Integer.valueOf(i18));
        if (num != null && num.intValue() == 0) {
            concurrentHashMap3.remove(java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
            wVar.f298213a.m112365x9db8ee03(wVar.f60634xf042a733, i18);
        }
    }

    public final void c(int i17) {
        if (this.f298196a == i17) {
            return;
        }
        this.f298196a = i17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a();
        int i18 = this.f298196a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f298211b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
        concurrentHashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void d(yz5.l firstFetchCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstFetchCallback, "firstFetchCallback");
        ((java.util.ArrayList) this.f298205j).add(firstFetchCallback);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a();
        int i17 = this.f298196a;
        boolean z17 = this.f298197b;
        a17.getClass();
        a17.f298210a.put(java.lang.Integer.valueOf(i17), this);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
        wVar.f298213a.m112354x9db8edf9(wVar.f60634xf042a733, i17, z17);
    }

    public final java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        synchronized (this) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a();
            int i17 = this.f298196a;
            a17.getClass();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
            if (wVar.f298213a.m112363x9db8ee02(wVar.f60634xf042a733, i17)) {
                if (this.f298198c.isEmpty() && this.f298199d.isEmpty() && this.f298200e.isEmpty()) {
                    this.f298198c.clear();
                    this.f298198c.addAll(wVar.c(this.f298196a));
                    java.util.Map map = this.f298204i;
                    bw5.ia iaVar = bw5.ia.EmoticonDesignerListDataType_StorePack;
                    int i18 = this.f298196a;
                    map.put(iaVar, java.lang.Boolean.valueOf(wVar.f298213a.m112359x9db8edfe(wVar.f60634xf042a733, i18, 1)));
                    this.f298199d.clear();
                    this.f298199d.addAll(wVar.a(this.f298196a));
                    java.util.Map map2 = this.f298204i;
                    bw5.ia iaVar2 = bw5.ia.EmoticonDesignerListDataType_SingleEmoji;
                    int i19 = this.f298196a;
                    map2.put(iaVar2, java.lang.Boolean.valueOf(wVar.f298213a.m112359x9db8edfe(wVar.f60634xf042a733, i19, 2)));
                    this.f298200e.clear();
                    this.f298200e.addAll(wVar.b(this.f298196a));
                    java.util.Map map3 = this.f298204i;
                    bw5.ia iaVar3 = bw5.ia.EmoticonDesignerListDataType_IPSet;
                    int i27 = this.f298196a;
                    map3.put(iaVar3, java.lang.Boolean.valueOf(wVar.f298213a.m112359x9db8edfe(wVar.f60634xf042a733, i27, 3)));
                }
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.o.f298190d));
            } else {
                d(new com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.r(nVar));
            }
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a18;
    }
}
