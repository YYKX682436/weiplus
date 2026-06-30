package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class a9 extends com.tencent.mm.pluginsdk.res.downloader.model.x {

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f75435i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.b6 f75436m;

    static {
        new com.tencent.mm.plugin.appbrand.appcache.f0();
        new com.tencent.mm.plugin.appbrand.appcache.k7();
    }

    public a9(m81.b bVar) {
        super(bVar);
        com.tencent.mm.plugin.appbrand.appcache.a5 a5Var;
        this.f75435i = null;
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.tencent.mm.plugin.appbrand.appcache.c6.class)).all()).iterator();
        while (true) {
            if (!it.hasNext()) {
                a5Var = null;
                break;
            } else if (((com.tencent.mm.plugin.appbrand.appcache.c6) ((fs.q) it.next()).get()) != null) {
                a5Var = com.tencent.mm.plugin.appbrand.appcache.b5.b(bVar) ? new com.tencent.mm.plugin.appbrand.appcache.a5(bVar, null) : null;
                if (a5Var != null) {
                    break;
                }
            }
        }
        this.f75436m = a5Var != null ? a5Var : null;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x, com.tencent.mm.pluginsdk.res.downloader.model.i
    public java.lang.String a() {
        return this.f75435i;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x, com.tencent.mm.pluginsdk.res.downloader.model.i
    public boolean b(long j17) {
        com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(e()).s();
        if (s17 == null) {
            return true;
        }
        android.os.StatFs statFs = new android.os.StatFs(s17.o());
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        return availableBlocksLong < 0 || availableBlocksLong > j17;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.m
    public com.tencent.mm.pluginsdk.res.downloader.model.k c() {
        return (m81.b) this.f189688d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0028, code lost:
    
        if (r5.f189729g == 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.pluginsdk.res.downloader.model.v g(com.tencent.mm.pluginsdk.res.downloader.model.t r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WxaPkgDownloadPerformer"
            r1 = 3
            r2 = 0
            r3 = 0
            com.tencent.mm.pluginsdk.res.downloader.model.k r4 = r10.f189688d     // Catch: java.lang.Exception -> L63
            m81.b r4 = (m81.b) r4     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = r4.f189714c     // Catch: java.lang.Exception -> L63
            com.tencent.mm.vfs.w6.h(r5)     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = r4.f189717f     // Catch: java.lang.Exception -> L63
            r10.f75435i = r5     // Catch: java.lang.Exception -> L63
            com.tencent.mm.plugin.appbrand.appcache.b6 r6 = r10.f75436m
            java.lang.String r7 = "https"
            boolean r5 = r5.startsWith(r7)     // Catch: java.lang.Exception -> L63
            r7 = r6
            com.tencent.mm.plugin.appbrand.appcache.a5 r7 = (com.tencent.mm.plugin.appbrand.appcache.a5) r7     // Catch: java.lang.Exception -> L63
            r7.d(r5)     // Catch: java.lang.Exception -> L63
            com.tencent.mm.pluginsdk.res.downloader.model.v r5 = r10.h()     // Catch: java.lang.Exception -> L63
            if (r5 == 0) goto L2a
            int r7 = r5.f189729g     // Catch: java.lang.Exception -> L61
            if (r7 != r1) goto L5b
        L2a:
            java.lang.String r7 = "onCDNDownloaderFailed key:%s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L61
            java.lang.String r4 = r4.f189712a     // Catch: java.lang.Exception -> L61
            r9[r2] = r4     // Catch: java.lang.Exception -> L61
            com.tencent.mars.xlog.Log.e(r0, r7, r9)     // Catch: java.lang.Exception -> L61
            r4 = r6
            com.tencent.mm.plugin.appbrand.appcache.a5 r4 = (com.tencent.mm.plugin.appbrand.appcache.a5) r4     // Catch: java.lang.Exception -> L61
            com.tencent.mm.plugin.appbrand.appcache.z4 r7 = r4.f75420d     // Catch: java.lang.Exception -> L61
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
            android.os.Bundle r4 = r11.f189732j     // Catch: java.lang.Exception -> L61
            java.lang.String r7 = "RESPONSE_KEY_FALLBACK_USE_SYSTEM_URL_CONNECTION"
            r4.putBoolean(r7, r8)     // Catch: java.lang.Exception -> L61
        L5a:
            r5 = r11
        L5b:
            com.tencent.mm.plugin.appbrand.appcache.a5 r6 = (com.tencent.mm.plugin.appbrand.appcache.a5) r6     // Catch: java.lang.Exception -> L61
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
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r11, r4, r2)
        L6c:
            if (r5 != 0) goto L75
            com.tencent.mm.pluginsdk.res.downloader.model.v r11 = new com.tencent.mm.pluginsdk.res.downloader.model.v
            r0 = -1
            r11.<init>(r10, r3, r0, r1)
            return r11
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.a9.g(com.tencent.mm.pluginsdk.res.downloader.model.t):com.tencent.mm.pluginsdk.res.downloader.model.v");
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.i
    public java.lang.String getGroupId() {
        return "AppBrandWxaPkgDownloader";
    }

    public final com.tencent.mm.pluginsdk.res.downloader.model.v h() {
        java.lang.String str;
        com.tencent.mm.pluginsdk.res.downloader.model.v vVar;
        java.lang.String str2;
        com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent wxaPkgCDNDownloaderEventEvent = new com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent();
        m81.b bVar = (m81.b) this.f189688d;
        am.b30 b30Var = wxaPkgCDNDownloaderEventEvent.f55000g;
        b30Var.f6215b = bVar;
        b30Var.f6214a = 1;
        wxaPkgCDNDownloaderEventEvent.b(android.os.Looper.getMainLooper());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_weapp_core_pkg_download, 0) == 1) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
            if (!((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstalled()) {
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstall(new com.tencent.mm.plugin.appbrand.appcache.j7(atomicBoolean, countDownLatch));
                countDownLatch.await();
            }
            if (atomicBoolean.get()) {
                m81.b bVar2 = (m81.b) this.f189688d;
                boolean e17 = bVar2.e();
                if (e17) {
                    java.lang.String str3 = bVar2.f189714c;
                    kotlin.jvm.internal.o.f(str3, "getFilePath(...)");
                    java.lang.String g17 = lp0.b.g();
                    kotlin.jvm.internal.o.f(g17, "DATAROOT_MOBILEMEM_WXAPKG(...)");
                    iz5.a.g(null, r26.i0.y(str3, g17, false));
                    java.lang.String d17 = lp0.b.d();
                    java.lang.String str4 = bVar2.f189714c;
                    kotlin.jvm.internal.o.f(str4, "getFilePath(...)");
                    java.lang.String substring = str4.substring(lp0.b.g().length());
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    str = s46.c.a(d17, substring);
                } else {
                    str = bVar2.f189714c;
                }
                java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, true);
                java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(1);
                com.tencent.mm.pluginsdk.res.downloader.model.v[] vVarArr = new com.tencent.mm.pluginsdk.res.downloader.model.v[1];
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppCoreDownloadPerformer", "start download, urlKey:%s, url:%s, filePath:%s, isForPreDownload:%b", f(), this.f75435i, bVar2.f189714c, java.lang.Boolean.valueOf(e17));
                com.tencent.mm.weapp_core.WeAppDownloader weAppDownloader = com.tencent.mm.plugin.appbrand.yf.f92429a;
                java.lang.String str5 = bVar2.f189717f;
                kotlin.jvm.internal.o.f(str5, "getURL(...)");
                java.lang.String o17 = r6Var.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                long j17 = bVar2.f189720i;
                boolean e18 = bVar2.e();
                com.tencent.mm.plugin.appbrand.appcache.i7 i7Var = new com.tencent.mm.plugin.appbrand.appcache.i7(this, i17, bVar2, vVarArr, countDownLatch2, r6Var);
                long download = com.tencent.mm.plugin.appbrand.yf.f92429a.download(str5, o17, j17, e18);
                synchronized (com.tencent.mm.plugin.appbrand.yf.f92430b) {
                    com.tencent.mm.plugin.appbrand.yf.f92431c.put(java.lang.Long.valueOf(download), i7Var);
                }
                try {
                    countDownLatch2.await();
                } catch (java.lang.InterruptedException unused) {
                }
                vVar = vVarArr[0];
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeAppCoreDownloadPerformer", "perform, syncDownloadGPBundleIfNeed failed");
                vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v(this, (java.lang.Exception) null, 0, 3);
                vVar.f189732j.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
            }
        } else {
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(true);
            if (!((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstalled()) {
                java.util.concurrent.CountDownLatch countDownLatch3 = new java.util.concurrent.CountDownLatch(1);
                ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstall(new com.tencent.mm.plugin.appbrand.appcache.e0(atomicBoolean2, countDownLatch3));
                countDownLatch3.await();
            }
            if (atomicBoolean2.get()) {
                m81.b bVar3 = (m81.b) this.f189688d;
                jz5.l[] lVarArr = new jz5.l[1];
                java.lang.String property = java.lang.System.getProperty("http.agent");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (property == null) {
                    property = "";
                }
                java.lang.String a17 = ik1.l0.a(context, property, (ik1.k0) nd.f.a(ik1.k0.class));
                kotlin.jvm.internal.o.f(a17, "appendUserAgent(...)");
                lVarArr[0] = new jz5.l("User-Agent", a17);
                java.util.ArrayList d18 = kz5.c0.d(lVarArr);
                if (bVar3.e()) {
                    java.lang.String str7 = bVar3.f189714c;
                    kotlin.jvm.internal.o.f(str7, "getFilePath(...)");
                    java.lang.String g18 = lp0.b.g();
                    kotlin.jvm.internal.o.f(g18, "DATAROOT_MOBILEMEM_WXAPKG(...)");
                    iz5.a.g(null, r26.i0.y(str7, g18, false));
                    java.lang.String d19 = lp0.b.d();
                    java.lang.String str8 = bVar3.f189714c;
                    kotlin.jvm.internal.o.f(str8, "getFilePath(...)");
                    java.lang.String substring2 = str8.substring(lp0.b.g().length());
                    kotlin.jvm.internal.o.f(substring2, "substring(...)");
                    str2 = s46.c.a(d19, substring2);
                } else {
                    str2 = bVar3.f189714c;
                }
                java.lang.String i18 = com.tencent.mm.vfs.w6.i(str2, true);
                java.util.concurrent.CountDownLatch countDownLatch4 = new java.util.concurrent.CountDownLatch(1);
                com.tencent.mm.pluginsdk.res.downloader.model.v[] vVarArr2 = new com.tencent.mm.pluginsdk.res.downloader.model.v[1];
                java.lang.String f17 = f();
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str2);
                com.tencent.mm.plugin.appbrand.appcache.b0 b0Var = com.tencent.mm.plugin.appbrand.appcache.b0.f75451a;
                java.lang.String str9 = bVar3.f189717f;
                kotlin.jvm.internal.o.f(str9, "getURL(...)");
                org.chromium.net.UrlRequest a18 = b0Var.a(str9, d18, r6Var2, bVar3.f189720i, new com.tencent.mm.plugin.appbrand.appcache.c0(r6Var2, f17, this, i18, bVar3, vVarArr2, countDownLatch4), new com.tencent.mm.plugin.appbrand.appcache.d0(this), bVar3.e());
                try {
                    countDownLatch4.await();
                } catch (java.lang.InterruptedException unused2) {
                    if (!a18.isDone()) {
                        a18.cancel();
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChromiumCronetPerformer", "cronet perform, urlKey %s, await but interrupted", bVar3.f189712a);
                    }
                }
                vVar = vVarArr2[0];
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChromiumCronetPerformer", "perform, syncDownloadGPBundleIfNeed failed");
                vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v(this, (java.lang.Exception) null, 0, 3);
                vVar.f189732j.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
            }
        }
        com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent wxaPkgCDNDownloaderEventEvent2 = new com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent();
        am.b30 b30Var2 = wxaPkgCDNDownloaderEventEvent2.f55000g;
        b30Var2.f6215b = bVar;
        b30Var2.f6216c = vVar;
        b30Var2.f6214a = 2;
        wxaPkgCDNDownloaderEventEvent2.b(android.os.Looper.getMainLooper());
        return vVar;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x, com.tencent.mm.pluginsdk.res.downloader.model.i
    public boolean retry() {
        if (wo.p1.a() != 1) {
            return false;
        }
        return super.retry();
    }
}
