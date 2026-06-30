package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class a5 implements com.tencent.mm.plugin.appbrand.appcache.b6 {

    /* renamed from: a, reason: collision with root package name */
    public final m81.b f75417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75418b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75419c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appcache.z4 f75420d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f75421e;

    /* renamed from: f, reason: collision with root package name */
    public long f75422f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f75423g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f75424h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f75425i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f75426j = 0;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.kv_14609 f75427k;

    public a5(m81.b bVar, com.tencent.mm.plugin.appbrand.appcache.y4 y4Var) {
        this.f75417a = bVar;
        this.f75418b = k91.l3.a(com.tencent.mm.plugin.appbrand.report.w0.b(bVar.f324688l, 0)) ? 776 : 368;
        java.lang.String[] split = bVar.f324688l.split(java.util.regex.Pattern.quote("$"));
        this.f75419c = (split == null ? -1 : split.length) == 2;
    }

    public final void a(int i17) {
        b(this.f75418b, i17);
    }

    public final void b(int i17, int i18) {
        if (this.f75421e == null) {
            this.f75421e = new java.util.ArrayList();
        }
        this.f75421e.add(new com.tencent.mars.smc.IDKey(i17, i18, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)|4|(1:202)(1:8)|9|(6:(1:95)(1:14)|15|(1:94)(1:20)|(1:93)(1:25)|26|(4:65|(2:(1:68)(1:86)|69)(2:87|(2:(1:90)(1:92)|91))|(2:(1:72)(1:74)|73)|(1:(2:(1:78)(1:80)|79)(1:(2:(1:83)(1:85)|84))))(1:(1:(1:(4:(1:33)(1:42)|34|(1:36)|(1:(1:39)(1:(1:41)))))(4:(1:44)(1:53)|45|(1:47)|(1:(1:50)(1:(1:52)))))(4:(1:55)(1:64)|56|(1:58)|(1:(1:61)(1:(1:63))))))|(1:201)(3:(2:199|107)|106|107)|(3:195|196|(12:198|113|(9:118|119|120|121|122|123|124|125|(4:(1:183)(8:130|(1:132)(2:173|(1:175)(2:176|(1:178)(2:179|(1:181)(1:182))))|133|(1:135)|136|(1:138)(1:172)|139|(1:141))|(6:143|(1:145)(2:161|(1:163)(2:164|(1:166)(1:167)))|146|(1:148)|149|(1:151))(2:168|(1:170)(1:171))|152|(1:159)(2:156|157))(1:184))|193|119|120|121|122|123|124|125|(0)(0)))|(1:194)(1:112)|113|(10:115|118|119|120|121|122|123|124|125|(0)(0))|193|119|120|121|122|123|124|125|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0182, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.pluginsdk.res.downloader.model.v r22) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.a5.c(com.tencent.mm.pluginsdk.res.downloader.model.v):void");
    }

    public void d(boolean z17) {
        m81.b bVar = this.f75417a;
        int i17 = 0;
        if (bVar instanceof com.tencent.mm.plugin.appbrand.appcache.p8) {
            this.f75420d = "@LibraryAppId".equals(bVar.f324688l) ? com.tencent.mm.plugin.appbrand.appcache.z4.LIB_INCREMENTAL_UPDATE : com.tencent.mm.plugin.appbrand.appcache.z4.INCREMENTAL_UPDATE;
            m81.b bVar2 = this.f75417a;
            com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var = new com.tencent.mm.plugin.appbrand.report.model.kv_14609(bVar2.f324688l, ((com.tencent.mm.plugin.appbrand.appcache.p8) bVar2).f75723q, ((com.tencent.mm.plugin.appbrand.appcache.p8) bVar2).f75724r);
            this.f75427k = kv_14609Var;
            kv_14609Var.b();
        } else if ("@LibraryAppId".equals(bVar.f324688l)) {
            this.f75420d = com.tencent.mm.plugin.appbrand.appcache.z4.LIB_UPDATE;
        } else {
            boolean b17 = com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f75417a.f324690n);
            com.tencent.mm.plugin.appbrand.appcache.z4 z4Var = com.tencent.mm.plugin.appbrand.appcache.z4.DOWNLOAD;
            if (b17) {
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b18 = com.tencent.mm.plugin.appbrand.launching.v3.b(this.f75417a.f324688l, 1);
                if (b18 != null) {
                    z4Var = com.tencent.mm.plugin.appbrand.appcache.z4.UPDATE;
                }
                this.f75420d = z4Var;
                m81.b bVar3 = this.f75417a;
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var2 = new com.tencent.mm.plugin.appbrand.report.model.kv_14609(bVar3.f324688l, b18 == null ? 0 : b18.pkgVersion, bVar3.f324689m);
                this.f75427k = kv_14609Var2;
                kv_14609Var2.b();
            } else {
                m81.b bVar4 = this.f75417a;
                if (bVar4 instanceof com.tencent.mm.plugin.appbrand.appcache.m8) {
                    java.lang.String str = bVar4.f324688l;
                    int i18 = bVar4.f324690n;
                    com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var3 = new com.tencent.mm.plugin.appbrand.report.model.kv_14609(str, 0, 0);
                    kv_14609Var3.f88030h = i18 + 1;
                    this.f75427k = kv_14609Var3;
                    kv_14609Var3.b();
                }
                this.f75420d = z4Var;
            }
        }
        int ordinal = this.f75420d.ordinal();
        if (ordinal == 0) {
            i17 = 1;
        } else if (ordinal == 1) {
            i17 = 10;
        } else if (ordinal == 2) {
            i17 = 20;
        } else if (ordinal == 3) {
            i17 = 35;
        } else if (ordinal == 4) {
            i17 = 46;
        }
        a(i17);
        this.f75422f = android.os.SystemClock.elapsedRealtime();
        if (this.f75417a.f324691o != null) {
            this.f75427k.G = this.f75417a.f324691o.f390799f;
            this.f75427k.H = this.f75417a.f324691o.f390798e ? 1 : 0;
            this.f75427k.I = this.f75417a.f324691o.f390800g;
        }
    }
}
