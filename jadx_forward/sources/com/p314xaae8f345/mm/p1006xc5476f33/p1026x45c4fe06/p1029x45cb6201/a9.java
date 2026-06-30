package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class a9 extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x {

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156968i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b6 f156969m;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f0();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k7();
    }

    public a9(m81.b bVar) {
        super(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5 a5Var;
        this.f156968i = null;
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c6.class)).all()).iterator();
        while (true) {
            if (!it.hasNext()) {
                a5Var = null;
                break;
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c6) ((fs.q) it.next()).get()) != null) {
                a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b5.b(bVar) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5(bVar, null) : null;
                if (a5Var != null) {
                    break;
                }
            }
        }
        this.f156969m = a5Var != null ? a5Var : null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    public java.lang.String a() {
        return this.f156968i;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    public boolean b(long j17) {
        com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(e()).s();
        if (s17 == null) {
            return true;
        }
        android.os.StatFs statFs = new android.os.StatFs(s17.o());
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        return availableBlocksLong < 0 || availableBlocksLong > j17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m
    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k c() {
        return (m81.b) this.f271221d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0028, code lost:
    
        if (r5.f271262g == 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v g(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.t r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WxaPkgDownloadPerformer"
            r1 = 3
            r2 = 0
            r3 = 0
            com.tencent.mm.pluginsdk.res.downloader.model.k r4 = r10.f271221d     // Catch: java.lang.Exception -> L63
            m81.b r4 = (m81.b) r4     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = r4.f271247c     // Catch: java.lang.Exception -> L63
            com.p314xaae8f345.mm.vfs.w6.h(r5)     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = r4.f271250f     // Catch: java.lang.Exception -> L63
            r10.f156968i = r5     // Catch: java.lang.Exception -> L63
            com.tencent.mm.plugin.appbrand.appcache.b6 r6 = r10.f156969m
            java.lang.String r7 = "https"
            boolean r5 = r5.startsWith(r7)     // Catch: java.lang.Exception -> L63
            r7 = r6
            com.tencent.mm.plugin.appbrand.appcache.a5 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5) r7     // Catch: java.lang.Exception -> L63
            r7.d(r5)     // Catch: java.lang.Exception -> L63
            com.tencent.mm.pluginsdk.res.downloader.model.v r5 = r10.h()     // Catch: java.lang.Exception -> L63
            if (r5 == 0) goto L2a
            int r7 = r5.f271262g     // Catch: java.lang.Exception -> L61
            if (r7 != r1) goto L5b
        L2a:
            java.lang.String r7 = "onCDNDownloaderFailed key:%s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L61
            java.lang.String r4 = r4.f271245a     // Catch: java.lang.Exception -> L61
            r9[r2] = r4     // Catch: java.lang.Exception -> L61
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7, r9)     // Catch: java.lang.Exception -> L61
            r4 = r6
            com.tencent.mm.plugin.appbrand.appcache.a5 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5) r4     // Catch: java.lang.Exception -> L61
            com.tencent.mm.plugin.appbrand.appcache.z4 r7 = r4.f156953d     // Catch: java.lang.Exception -> L61
            int r7 = r7.ordinal()     // Catch: java.lang.Exception -> L61
            r9 = 2
            if (r7 == r9) goto L48
            r9 = 4
            if (r7 == r9) goto L48
            r7 = 34
            goto L4a
        L48:
            r7 = 33
        L4a:
            r4.a(r7)     // Catch: java.lang.Exception -> L61
            com.tencent.mm.pluginsdk.res.downloader.model.v r11 = super.g(r11)     // Catch: java.lang.Exception -> L61
            if (r11 == 0) goto L5a
            android.os.Bundle r4 = r11.f271265j     // Catch: java.lang.Exception -> L61
            java.lang.String r7 = "RESPONSE_KEY_FALLBACK_USE_SYSTEM_URL_CONNECTION"
            r4.putBoolean(r7, r8)     // Catch: java.lang.Exception -> L61
        L5a:
            r5 = r11
        L5b:
            com.tencent.mm.plugin.appbrand.appcache.a5 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5) r6     // Catch: java.lang.Exception -> L61
            r6.c(r5)     // Catch: java.lang.Exception -> L61
            goto L6c
        L61:
            r11 = move-exception
            goto L65
        L63:
            r11 = move-exception
            r5 = r3
        L65:
            java.lang.String r4 = "perform failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r11, r4, r2)
        L6c:
            if (r5 != 0) goto L75
            com.tencent.mm.pluginsdk.res.downloader.model.v r11 = new com.tencent.mm.pluginsdk.res.downloader.model.v
            r0 = -1
            r11.<init>(r10, r3, r0, r1)
            return r11
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9.g(com.tencent.mm.pluginsdk.res.downloader.model.t):com.tencent.mm.pluginsdk.res.downloader.model.v");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    /* renamed from: getGroupId */
    public java.lang.String mo49249x4f4a97c4() {
        return "AppBrandWxaPkgDownloader";
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v h() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar;
        java.lang.String str2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6284x7d3d5b36 c6284x7d3d5b36 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6284x7d3d5b36();
        m81.b bVar = (m81.b) this.f271221d;
        am.b30 b30Var = c6284x7d3d5b36.f136533g;
        b30Var.f87748b = bVar;
        b30Var.f87747a = 1;
        c6284x7d3d5b36.b(android.os.Looper.getMainLooper());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_weapp_core_pkg_download, 0) == 1) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48894x44a66de6()) {
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48893xf78c0707(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j7(atomicBoolean, countDownLatch));
                countDownLatch.await();
            }
            if (atomicBoolean.get()) {
                m81.b bVar2 = (m81.b) this.f271221d;
                boolean e17 = bVar2.e();
                if (e17) {
                    java.lang.String str3 = bVar2.f271247c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getFilePath(...)");
                    java.lang.String g17 = lp0.b.g();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "DATAROOT_MOBILEMEM_WXAPKG(...)");
                    iz5.a.g(null, r26.i0.y(str3, g17, false));
                    java.lang.String d17 = lp0.b.d();
                    java.lang.String str4 = bVar2.f271247c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getFilePath(...)");
                    java.lang.String substring = str4.substring(lp0.b.g().length());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    str = s46.c.a(d17, substring);
                } else {
                    str = bVar2.f271247c;
                }
                java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
                java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(1);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[] vVarArr = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[1];
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppCoreDownloadPerformer", "start download, urlKey:%s, url:%s, filePath:%s, isForPreDownload:%b", f(), this.f156968i, bVar2.f271247c, java.lang.Boolean.valueOf(e17));
                com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8 abstractC22923xa7798be8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173962a;
                java.lang.String str5 = bVar2.f271250f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getURL(...)");
                java.lang.String o17 = r6Var.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                long j17 = bVar2.f271253i;
                boolean e18 = bVar2.e();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7 i7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7(this, i17, bVar2, vVarArr, countDownLatch2, r6Var);
                long m83379x551ac888 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173962a.m83379x551ac888(str5, o17, j17, e18);
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173963b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173964c.put(java.lang.Long.valueOf(m83379x551ac888), i7Var);
                }
                try {
                    countDownLatch2.await();
                } catch (java.lang.InterruptedException unused) {
                }
                vVar = vVarArr[0];
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppCoreDownloadPerformer", "perform, syncDownloadGPBundleIfNeed failed");
                vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(this, (java.lang.Exception) null, 0, 3);
                vVar.f271265j.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
            }
        } else {
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(true);
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48894x44a66de6()) {
                java.util.concurrent.CountDownLatch countDownLatch3 = new java.util.concurrent.CountDownLatch(1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48893xf78c0707(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e0(atomicBoolean2, countDownLatch3));
                countDownLatch3.await();
            }
            if (atomicBoolean2.get()) {
                m81.b bVar3 = (m81.b) this.f271221d;
                jz5.l[] lVarArr = new jz5.l[1];
                java.lang.String property = java.lang.System.getProperty("http.agent");
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (property == null) {
                    property = "";
                }
                java.lang.String a17 = ik1.l0.a(context, property, (ik1.k0) nd.f.a(ik1.k0.class));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "appendUserAgent(...)");
                lVarArr[0] = new jz5.l("User-Agent", a17);
                java.util.ArrayList d18 = kz5.c0.d(lVarArr);
                if (bVar3.e()) {
                    java.lang.String str7 = bVar3.f271247c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "getFilePath(...)");
                    java.lang.String g18 = lp0.b.g();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "DATAROOT_MOBILEMEM_WXAPKG(...)");
                    iz5.a.g(null, r26.i0.y(str7, g18, false));
                    java.lang.String d19 = lp0.b.d();
                    java.lang.String str8 = bVar3.f271247c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str8, "getFilePath(...)");
                    java.lang.String substring2 = str8.substring(lp0.b.g().length());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                    str2 = s46.c.a(d19, substring2);
                } else {
                    str2 = bVar3.f271247c;
                }
                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str2, true);
                java.util.concurrent.CountDownLatch countDownLatch4 = new java.util.concurrent.CountDownLatch(1);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[] vVarArr2 = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[1];
                java.lang.String f17 = f();
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b0.f156984a;
                java.lang.String str9 = bVar3.f271250f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, "getURL(...)");
                org.p3343x72743996.net.AbstractC29563x9a627640 a18 = b0Var.a(str9, d18, r6Var2, bVar3.f271253i, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c0(r6Var2, f17, this, i18, bVar3, vVarArr2, countDownLatch4), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d0(this), bVar3.e());
                try {
                    countDownLatch4.await();
                } catch (java.lang.InterruptedException unused2) {
                    if (!a18.mo153669xb9a1ffcc()) {
                        a18.mo153666xae7a2e7a();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChromiumCronetPerformer", "cronet perform, urlKey %s, await but interrupted", bVar3.f271245a);
                    }
                }
                vVar = vVarArr2[0];
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChromiumCronetPerformer", "perform, syncDownloadGPBundleIfNeed failed");
                vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(this, (java.lang.Exception) null, 0, 3);
                vVar.f271265j.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6284x7d3d5b36 c6284x7d3d5b362 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6284x7d3d5b36();
        am.b30 b30Var2 = c6284x7d3d5b362.f136533g;
        b30Var2.f87748b = bVar;
        b30Var2.f87749c = vVar;
        b30Var2.f87747a = 2;
        c6284x7d3d5b362.b(android.os.Looper.getMainLooper());
        return vVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    /* renamed from: retry */
    public boolean mo49250x67622a8() {
        if (wo.p1.a() != 1) {
            return false;
        }
        return super.mo49250x67622a8();
    }
}
