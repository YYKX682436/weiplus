package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class l0 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 f259202q = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0();

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f259203r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f259204s;

    /* renamed from: a, reason: collision with root package name */
    public r45.be4 f259205a;

    /* renamed from: b, reason: collision with root package name */
    public r45.be4 f259206b;

    /* renamed from: c, reason: collision with root package name */
    public long f259207c;

    /* renamed from: d, reason: collision with root package name */
    public long f259208d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f259209e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f259210f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f259212h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f259213i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f259214j;

    /* renamed from: k, reason: collision with root package name */
    public int f259215k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f259216l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f259217m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bp0 f259218n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f259219o;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f259211g = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Vector f259220p = new java.util.Vector();

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.D() + "wallet/lqt/");
        sb6.append("/save/");
        f259203r = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(lp0.b.D() + "wallet/lqt/");
        sb7.append("/fetch/");
        f259204s = sb7.toString();
    }

    public final void a(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.be4 be4Var = z17 ? this.f259205a : this.f259206b;
        long j17 = z17 ? this.f259207c : this.f259208d;
        if (be4Var != null || !z17) {
            if (currentTimeMillis - j17 > 3600000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "checkCache, saveCache time exceed, try reload from disk");
                return;
            }
            return;
        }
        java.lang.String str = z17 ? f259203r : f259204s;
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
        if (s17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "tryLoadCacheFromDisk: %s, save: %s", s17, java.lang.Boolean.valueOf(z17));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.Iterator it = s17.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b;
            java.lang.String str3 = str + str2;
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str2, 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "file name: %s", java.lang.Long.valueOf(V));
            if (V <= 0) {
                com.p314xaae8f345.mm.vfs.w6.h(str3);
            } else if (currentTimeMillis2 - V < 3600000) {
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str3, 0, -1);
                r45.be4 be4Var2 = new r45.be4();
                try {
                    be4Var2.mo11468x92b714fd(N);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LqtBindQueryInfoCache", e17, "parse bindquery from cache error: %s", e17.getMessage());
                    be4Var2 = null;
                }
                if (be4Var2 != null) {
                    java.util.concurrent.locks.ReentrantLock reentrantLock = this.f259211g;
                    reentrantLock.lock();
                    if (z17) {
                        this.f259205a = be4Var2;
                        this.f259209e = null;
                        this.f259207c = V;
                    } else {
                        this.f259206b = be4Var2;
                        this.f259210f = null;
                        this.f259208d = V;
                    }
                    reentrantLock.unlock();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "succ get saveCache: %s %s", be4Var2, java.lang.Long.valueOf(V));
                    return;
                }
            } else {
                com.p314xaae8f345.mm.vfs.w6.h(str3);
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b(boolean z17) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c> d17;
        a(z17);
        r45.be4 be4Var = z17 ? this.f259205a : this.f259206b;
        if (be4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(be4Var.f452229d) || (d17 = d(z17)) == null || d17.size() <= 0) {
            return null;
        }
        java.lang.String str = be4Var.f452229d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c : d17) {
            if (c19091x9511676c != null && str.equals(c19091x9511676c.f69225xed6d60f6)) {
                return c19091x9511676c;
            }
        }
        return null;
    }

    public java.util.List c(boolean z17) {
        a(z17);
        if ((z17 ? this.f259205a : this.f259206b) != null) {
            return d(z17);
        }
        return null;
    }

    public final java.util.List d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b18;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f259211g;
        r45.be4 be4Var = z17 ? this.f259205a : this.f259206b;
        try {
            reentrantLock.lock();
            if (be4Var == null) {
                if (z17) {
                    this.f259209e = null;
                } else {
                    this.f259210f = null;
                }
                return null;
            }
            if (z17) {
                java.util.List list = this.f259209e;
                if (list != null && list.size() > 0) {
                    return this.f259209e;
                }
            } else {
                java.util.List list2 = this.f259210f;
                if (list2 != null && list2.size() > 0) {
                    return this.f259210f;
                }
            }
            if (z17) {
                this.f259209e = new java.util.ArrayList();
                r45.gd gdVar = this.f259205a.f452232g;
                if (gdVar != null && (b18 = at4.r1.b(gdVar)) != null) {
                    this.f259209e.add(b18);
                }
                java.util.LinkedList linkedList = this.f259205a.f452230e;
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = this.f259205a.f452230e.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b19 = at4.i.b((r45.qv) it.next());
                        if (b19 != null) {
                            this.f259209e.add(b19);
                        }
                    }
                }
                return this.f259209e;
            }
            this.f259210f = new java.util.ArrayList();
            r45.gd gdVar2 = this.f259206b.f452232g;
            if (gdVar2 != null && (b17 = at4.r1.b(gdVar2)) != null) {
                this.f259210f.add(b17);
            }
            java.util.LinkedList linkedList2 = this.f259206b.f452230e;
            if (linkedList2 != null && linkedList2.size() > 0) {
                java.util.Iterator it6 = this.f259206b.f452230e.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b27 = at4.i.b((r45.qv) it6.next());
                    if (b27 != null) {
                        this.f259210f.add(b27);
                    }
                }
            }
            return this.f259210f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void e(r45.be4 be4Var, boolean z17, boolean z18, java.lang.String str) {
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.h0(this, str));
            return;
        }
        if (be4Var != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.f259211g;
            reentrantLock.lock();
            if (z17) {
                this.f259205a = be4Var;
                this.f259209e = null;
                this.f259207c = java.lang.System.currentTimeMillis();
            } else {
                this.f259206b = be4Var;
                this.f259210f = null;
                this.f259208d = java.lang.System.currentTimeMillis();
            }
            reentrantLock.unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "setCache: %s, save: %s", be4Var, java.lang.Boolean.valueOf(z17));
            try {
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.j0(this, be4Var.mo14344x5f01b1f6(), z17), "LqtBindQueryInfoCache_saveCacheToDiski");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LqtBindQueryInfoCache", e17, "saveCacheToDisk error: %s", e17.getMessage());
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i0(this));
        }
    }

    public void f(r45.ny4 ny4Var, int i17) {
        this.f259212h = ny4Var.f463281g;
        this.f259213i = ny4Var.f463282h;
        this.f259214j = ny4Var.f463283i;
        this.f259215k = ny4Var.f463284m;
        this.f259216l = ny4Var.f463286o;
        this.f259218n = ny4Var.f463287p;
        this.f259219o = ny4Var.f463297z;
        r45.ny4 ny4Var2 = new r45.ny4();
        ny4Var2.f76492x92037252 = ny4Var.f76492x92037252;
        ny4Var2.f463285n = ny4Var.f463285n;
        ny4Var2.f463289r = ny4Var.f463289r;
        ny4Var2.f463290s = ny4Var.f463290s;
        ny4Var2.f463291t = ny4Var.f463291t;
        ny4Var2.f463292u = ny4Var.f463292u;
        ny4Var2.f463293v = ny4Var.f463293v;
        ny4Var2.f463294w = ny4Var.f463294w;
        ny4Var2.f463295x = ny4Var.f463295x;
        ny4Var2.f463296y = ny4Var.f463296y;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WCPay.OnClickPurchaseRes");
        java.lang.String str = "";
        java.lang.String str2 = ((java.lang.String) gm0.j1.u().c().l(2, "")) + i17;
        try {
            byte[] mo14344x5f01b1f6 = ny4Var2.mo14344x5f01b1f6();
            java.lang.String encodeToString = mo14344x5f01b1f6.length > 0 ? android.util.Base64.encodeToString(mo14344x5f01b1f6, 0) : "";
            if (encodeToString != null && encodeToString.length() != 0) {
                str = encodeToString;
            }
            M.putString(str2, str);
        } catch (java.lang.Exception unused) {
        }
    }
}
