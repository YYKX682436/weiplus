package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159744a;

    /* renamed from: b, reason: collision with root package name */
    public uh1.x0 f159745b;

    /* renamed from: c, reason: collision with root package name */
    public uh1.a f159746c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f159747d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.f f159748e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f159749f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f159750g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f159751h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f159752i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f159753j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f159754k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f159755l;

    static {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ka.f166253a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ModularizingPkgRetrieverContract", "<clinit>");
    }

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f159749f = false;
        this.f159751h = false;
        this.f159744a = o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.f(o6Var);
        this.f159748e = fVar;
        this.f159749f = true;
        this.f159751h = true;
        this.f159745b = new uh1.x0(fVar, true);
        this.f159752i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f159753j = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f159754k = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f159755l = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).t3();
        if (t37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37).P2();
        }
        return null;
    }

    public final void a() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f159750g;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159744a;
        if (o6Var == null || o6Var.m0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "hy: unexpected null app config");
            return;
        }
        k91.r m07 = this.f159744a.m0();
        java.lang.String str = this.f159744a.f156336n;
        java.util.ArrayList arrayList = m07.f387285v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(arrayList == null ? 0 : arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "predownload subPackage size:%d", objArr);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String pathOrModule = (java.lang.String) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "predownload subPackage name:%s", pathOrModule);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f159744a;
                if (o6Var2 == null || o6Var2.E0() == null) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = o6Var2 == null ? "" : o6Var2.f156336n;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "runtime(%s) or sysConfig null", objArr2);
                } else if (o6Var2.S || o6Var2.L0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "runtime(%s) finishing", o6Var2.f156336n);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(o6Var2, false).j();
                    java.util.LinkedList linkedList = o6Var2.E0().f387385r.f156935g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathOrModule, "pathOrModule");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) ph1.i0.b(linkedList, pathOrModule, null, false, 6, null);
                    if (c11656xaf63146e == null || android.text.TextUtils.isEmpty(c11656xaf63146e.f156905md5)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "downloadSubPackage with appId:%s, moduleName:%s, get invalid module obj", o6Var2.f156336n, pathOrModule);
                    } else if (ph1.q.f435881a == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "downloadSubPackage fail!");
                    } else {
                        ph1.r b17 = ph1.q.f435881a.b(o6Var2, o6Var2.E0().f387385r.e(o6Var2.f156336n, c11656xaf63146e.f33454x337a8b), null);
                        b17.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.g(this, pathOrModule));
                        b17.a(ph1.o.f435879b);
                    }
                }
            }
        }
    }

    public void b() {
        uh1.x0 x0Var = this.f159745b;
        if (x0Var != null) {
            synchronized (x0Var.f509462j) {
                java.util.Iterator it = x0Var.f509462j.iterator();
                while (it.hasNext()) {
                    ((vh1.f) it.next()).f518554g = false;
                }
                x0Var.f509462j.clear();
            }
            synchronized (x0Var.f509463k) {
                java.util.Iterator it6 = x0Var.f509463k.iterator();
                while (it6.hasNext()) {
                    ((vh1.f) it6.next()).f518554g = false;
                }
                x0Var.f509463k.clear();
            }
            synchronized (x0Var.f509461i) {
                x0Var.f509461i.clear();
            }
            this.f159745b = null;
            this.f159748e = null;
            this.f159746c = null;
            this.f159747d = null;
            this.f159744a = null;
        }
        this.f159749f = false;
    }

    public final void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.h(this, str, str2);
        if (this.f159746c.f509281o <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "maxDownloadConcurrent <= 0 ");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f159746c.f509291y;
        uh1.x0 x0Var = this.f159745b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f509331b;
        uh1.h.f509328a.getClass();
        sb6.append(uh1.i.f509331b.incrementAndGet());
        sb6.append("");
        x0Var.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, hashMap, null, i17, hVar, sb6.toString(), "test");
    }

    public void d() {
        if (this.f159751h) {
            if (!this.f159749f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "hasn't init!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159744a;
            if (o6Var == null) {
                return;
            }
            if (o6Var.m0() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles getAppConfig null!");
                return;
            }
            org.json.JSONArray jSONArray = this.f159744a.m0().f387284u;
            if (jSONArray != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(3000, jSONArray.length());
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    try {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        if (jSONObject != null) {
                            java.lang.String optString = jSONObject.optString("url");
                            java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                                if (this.f159747d.mo49300xab27b564(optString2) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "predownload path %s has exists!", optString2);
                                } else {
                                    this.f159750g.add(optString);
                                    c(jSONObject, optString, optString2);
                                }
                            }
                        }
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGamePreloadManager", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            k91.r m07 = this.f159744a.m0();
            if (m07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles config null！");
                return;
            }
            java.lang.String str = this.f159744a.f156336n;
            java.util.ArrayList arrayList = m07.f387285v;
            if (arrayList != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(4000, arrayList.size());
            }
            a();
        }
    }
}
