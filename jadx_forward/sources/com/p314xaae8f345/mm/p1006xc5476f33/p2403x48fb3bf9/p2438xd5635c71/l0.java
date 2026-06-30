package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class l0 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f269389d;

    /* renamed from: e, reason: collision with root package name */
    public int f269390e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k f269391f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f269392g;

    public l0() {
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() % 1000);
        this.f269389d = currentTimeMillis;
        this.f269390e = -1;
        this.f269391f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k(currentTimeMillis, true, false, 4, null);
        this.f269392g = new java.util.HashMap();
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.s1 reporter) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "clear workerManager#" + this.f269389d);
        java.util.Iterator it = entrySet().iterator();
        int i18 = -1;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) entry.getValue();
            boolean z17 = k0Var.f269374d;
            int i19 = k0Var.f269371a;
            r45.d24 d24Var = k0Var.f269372b;
            if (!z17 && k0Var.f269375e) {
                java.util.HashMap hashMap = this.f269392g;
                if (!hashMap.containsKey(entry.getKey())) {
                    k0Var.f269376f = true;
                    k0Var.f269382l = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "WebComptWorker.recycle " + k0Var.f269377g + '@' + d24Var.f453539d + ':' + i19);
                    hashMap.put(entry.getKey(), k0Var);
                    reporter.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.Q);
                }
            }
            if (k0Var.f269374d || i19 != (i17 = this.f269390e)) {
                java.lang.String name = d24Var.f453539d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                k0Var.f269373c.e(name, "onWebComptDestroy", "{}");
                k0Var.a().mo14659x5cd39ffa();
            } else {
                i18 = i17;
            }
        }
        this.f269390e = i18;
        clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) {
            return super.containsValue((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) super.getOrDefault((java.lang.String) obj, (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0)) {
            return super.remove((java.lang.String) obj, (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) obj2);
        }
        return false;
    }
}
