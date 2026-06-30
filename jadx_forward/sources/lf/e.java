package lf;

/* loaded from: classes13.dex */
public abstract class e implements lk1.c {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 f399711d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa f399712e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f399713f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa f399714g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f399715h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f399716i = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f399717m = "";

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f399718n = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f399719o = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f399720p = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f399721q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce f399722r = new lf.c(this);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f399723s = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f399724t = new lf.d(this);

    public e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultTencentLocationManager", "DefaultTencentLocationManager() construct in process %s", bm5.f1.a());
    }

    public static void a(lf.e eVar, java.util.List list, int i17, java.lang.String str, lk1.a aVar) {
        eVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            lk1.b bVar = (lk1.b) it.next();
            if (bVar != null) {
                bVar.j(i17, str, aVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    @Override // lk1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Pg(java.lang.String r20, lk1.b r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e.Pg(java.lang.String, lk1.b, android.os.Bundle):void");
    }

    public lk1.a b(java.lang.String str, int i17) {
        boolean equals = "wgs84".equals(str);
        if (this.f399712e == null || java.lang.System.currentTimeMillis() - this.f399713f >= i17) {
            return null;
        }
        return d(this.f399712e, equals);
    }

    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 c() {
        if (this.f399711d == null) {
            synchronized (this) {
                if (this.f399711d == null) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l1.f162990u != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l1.f162990u.booleanValue();
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l1.f162990u = java.lang.Boolean.FALSE;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l1.f162990u.booleanValue();
                    }
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l1.f162990u.booleanValue()) {
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(com.p314xaae8f345.mm.vfs.w6.i(lp0.b.D() + "/lbs" + bm5.f1.a().substring(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b.length() + 1), true));
                        java.lang.String str = a17.f294812f;
                        if (str != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                            if (!a17.f294812f.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        try {
                            com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.m35005x1713bbc1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(a17.m82499x9616526c(), true)));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.DefaultTencentLocationManager", "", e17);
                        }
                    }
                    com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.m34999xe9f5beed(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    try {
                        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.m35006x1256ef26(new lf.a(this));
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.DefaultTencentLocationManager", "", e18);
                    }
                    if (android.text.TextUtils.isEmpty("")) {
                        this.f399711d = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.m34915x9cf0d20b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    } else {
                        this.f399711d = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.m34916x9cf0d20b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.util.Pair(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.f16242xc6cd8c52, ""));
                    }
                    this.f399711d.m34929xd46a31d4(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultTencentLocationManager", "%s Location Sdk Version %s", "", this.f399711d.m34923x52c258a2());
                }
            }
        }
        return this.f399711d;
    }

    public final lk1.a d(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, boolean z17) {
        lk1.a aVar = new lk1.a();
        if (z17) {
            aVar.f400529a = interfaceC4218x687499fa.m34899x2605e9e2();
            aVar.f400530b = interfaceC4218x687499fa.m34900x79d7af9();
            aVar.f400540l = "wgs84";
        } else {
            double[] dArr = new double[2];
            com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34971xde5778f6(new double[]{interfaceC4218x687499fa.m34899x2605e9e2(), interfaceC4218x687499fa.m34900x79d7af9()}, dArr);
            aVar.f400529a = dArr[0];
            aVar.f400530b = dArr[1];
            aVar.f400540l = "gcj02";
        }
        aVar.f400531c = "gps".equals(interfaceC4218x687499fa.m34904x40fe4367()) ? "gps" : "network";
        aVar.f400532d = interfaceC4218x687499fa.m34906x7526a691();
        aVar.f400533e = interfaceC4218x687499fa.m34883xfccaf66f();
        aVar.f400534f = interfaceC4218x687499fa.m34885xf53d8818();
        aVar.f400537i = interfaceC4218x687499fa.m34898x9b22a878();
        aVar.f400538j = interfaceC4218x687499fa.m34887x2fd5b378();
        if (interfaceC4218x687499fa.m34894x74653a5a() != null) {
            aVar.f400539k = interfaceC4218x687499fa.m34894x74653a5a().getDouble("steps");
        }
        interfaceC4218x687499fa.m34897x6d970d18();
        interfaceC4218x687499fa.m34896x1cd7c6ef();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4218x687499fa.m34897x6d970d18())) {
            aVar.f400535g = "";
            aVar.f400536h = "";
        } else {
            aVar.f400535g = interfaceC4218x687499fa.m34897x6d970d18();
            aVar.f400536h = interfaceC4218x687499fa.m34896x1cd7c6ef();
        }
        return aVar;
    }

    public final void e() {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f399719o).size() > 0 || ((java.util.concurrent.CopyOnWriteArrayList) this.f399718n).size() > 0 || ((java.util.concurrent.CopyOnWriteArrayList) this.f399720p).size() > 0 || ((java.util.concurrent.CopyOnWriteArrayList) this.f399721q).size() > 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultTencentLocationManager", "releaseLocationManager");
        c().m34924x3948a3a6(null);
    }

    @Override // lk1.c
    public synchronized boolean ia(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultTencentLocationManager", "[unregisterLocation]type:%s", str);
        if ("wgs84".equals(str)) {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f399720p).remove(bVar);
        } else {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f399721q).remove(bVar);
        }
        if (bundle != null) {
            ((java.util.HashSet) this.f399723s).remove(bundle.getString("smallAppKey"));
        }
        e();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[Catch: all -> 0x0133, LOOP:1: B:51:0x00e8->B:53:0x00ee, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:6:0x001d, B:8:0x0023, B:11:0x002b, B:14:0x0031, B:22:0x003a, B:24:0x0070, B:27:0x007d, B:30:0x0087, B:33:0x0092, B:36:0x00a8, B:38:0x00b4, B:47:0x00ca, B:50:0x00d8, B:51:0x00e8, B:53:0x00ee, B:55:0x00f8, B:57:0x0108, B:58:0x0111, B:64:0x0042, B:65:0x004a, B:67:0x0050, B:70:0x0058, B:73:0x005e, B:80:0x0067), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108 A[Catch: all -> 0x0133, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:6:0x001d, B:8:0x0023, B:11:0x002b, B:14:0x0031, B:22:0x003a, B:24:0x0070, B:27:0x007d, B:30:0x0087, B:33:0x0092, B:36:0x00a8, B:38:0x00b4, B:47:0x00ca, B:50:0x00d8, B:51:0x00e8, B:53:0x00ee, B:55:0x00f8, B:57:0x0108, B:58:0x0111, B:64:0x0042, B:65:0x004a, B:67:0x0050, B:70:0x0058, B:73:0x005e, B:80:0x0067), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    @Override // lk1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean w9(java.lang.String r5, lk1.b r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e.w9(java.lang.String, lk1.b, android.os.Bundle):boolean");
    }
}
