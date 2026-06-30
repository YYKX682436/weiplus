package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.video.player.thumb.p f90900a = new com.tencent.mm.plugin.appbrand.video.player.thumb.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f90901b = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        jz5.h.b(com.tencent.mm.plugin.appbrand.video.player.thumb.o.f90899d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001f A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:12:0x0008, B:14:0x0013, B:19:0x001f, B:22:0x0029, B:25:0x0032, B:27:0x0038, B:30:0x003f, B:4:0x0065), top: B:11:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            java.lang.String r1 = ""
            java.lang.String r2 = "getFileIdFromVideoUrl: newUrl: "
            if (r9 == 0) goto L64
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L97
            java.lang.String r4 = r3.getQuery()     // Catch: java.lang.Exception -> L97
            r5 = 0
            if (r4 == 0) goto L1c
            boolean r4 = r26.n0.N(r4)     // Catch: java.lang.Exception -> L97
            if (r4 == 0) goto L1a
            goto L1c
        L1a:
            r4 = r5
            goto L1d
        L1c:
            r4 = 1
        L1d:
            if (r4 != 0) goto L62
            java.lang.String r4 = "vid"
            java.lang.String r4 = r3.getQueryParameter(r4)     // Catch: java.lang.Exception -> L97
            if (r4 != 0) goto L29
            r4 = r1
        L29:
            java.lang.String r6 = "format_id"
            java.lang.String r6 = r3.getQueryParameter(r6)     // Catch: java.lang.Exception -> L97
            if (r6 != 0) goto L32
            r6 = r1
        L32:
            boolean r7 = r26.n0.N(r4)     // Catch: java.lang.Exception -> L97
            if (r7 == 0) goto L3f
            boolean r7 = r26.n0.N(r6)     // Catch: java.lang.Exception -> L97
            if (r7 == 0) goto L3f
            goto L62
        L3f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            r7.<init>()     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r3.getQuery()     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.o.d(r3)     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r26.i0.t(r9, r3, r1, r5)     // Catch: java.lang.Exception -> L97
            r7.append(r3)     // Catch: java.lang.Exception -> L97
            r7.append(r4)     // Catch: java.lang.Exception -> L97
            r3 = 95
            r7.append(r3)     // Catch: java.lang.Exception -> L97
            r7.append(r6)     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> L97
            goto L65
        L62:
            r3 = r9
            goto L65
        L64:
            r3 = r1
        L65:
            java.nio.charset.Charset r4 = r26.c.f368865a     // Catch: java.lang.Exception -> L97
            byte[] r4 = r3.getBytes(r4)     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r4, r5)     // Catch: java.lang.Exception -> L97
            java.lang.String r4 = kk.k.g(r4)     // Catch: java.lang.Exception -> L97
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            r5.<init>(r2)     // Catch: java.lang.Exception -> L97
            r5.append(r3)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "   url:"
            r5.append(r2)     // Catch: java.lang.Exception -> L97
            r5.append(r9)     // Catch: java.lang.Exception -> L97
            java.lang.String r9 = "  fileId:"
            r5.append(r9)     // Catch: java.lang.Exception -> L97
            r5.append(r4)     // Catch: java.lang.Exception -> L97
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> L97
            com.tencent.mars.xlog.Log.i(r0, r9)     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.o.d(r4)     // Catch: java.lang.Exception -> L97
            return r4
        L97:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getFileIdFromVideoUrl  error: "
            r2.<init>(r3)
            java.lang.String r9 = r9.getMessage()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            com.tencent.mars.xlog.Log.e(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.video.player.thumb.p.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[Catch: Exception -> 0x000e, TRY_LEAVE, TryCatch #0 {Exception -> 0x000e, blocks: (B:15:0x0005, B:7:0x0014), top: B:14:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L10
            boolean r3 = r26.n0.N(r6)     // Catch: java.lang.Exception -> Le
            if (r3 == 0) goto Lc
            goto L10
        Lc:
            r3 = r0
            goto L11
        Le:
            r6 = move-exception
            goto L1d
        L10:
            r3 = 1
        L11:
            if (r3 == 0) goto L14
            return r1
        L14:
            com.tencent.mm.sdk.platformtools.v3 r3 = r5.c()     // Catch: java.lang.Exception -> Le
            long r0 = r3.q(r6, r1)     // Catch: java.lang.Exception -> Le
            return r0
        L1d:
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r6, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.video.player.thumb.p.b(java.lang.String):long");
    }

    public final com.tencent.mm.sdk.platformtools.v3 c() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("ttplayer_preload_file");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return new com.tencent.mm.sdk.platformtools.v3(M, 1800L);
    }

    public final void d(android.content.Context context, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f90901b.compareAndSet(false, true)) {
            com.tencent.thumbplayer.api.TPPlayerMgr.setOnLogListener(new com.tencent.mm.plugin.appbrand.video.player.thumb.n());
            com.tencent.thumbplayer.api.TPPlayerMgr.initSdk(context.getApplicationContext(), "60303", 1);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyEnable(true);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyServiceType(100);
            com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.setUseService(false);
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.video.player.thumb.m.a();
            com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy tPDownloadProxy = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.getTPDownloadProxy(100);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D(), "ThumbVideoCache/TPDownload");
            com.tencent.mm.vfs.w6.u(r6Var.o());
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, a17);
            com.tencent.mm.vfs.w6.u(r6Var2.o());
            java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var2, "cache").o();
            com.tencent.mm.vfs.w6.u(o17);
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(o17, true);
            java.lang.String o18 = new com.tencent.mm.vfs.r6(r6Var2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).o();
            com.tencent.mm.vfs.w6.u(o18);
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(o18, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (z17) {
                try {
                    jSONObject.put("VodCacheEnable", true);
                    jSONObject.put("MemoryAjustInterval", Integer.MAX_VALUE);
                } catch (java.lang.Exception unused) {
                }
            }
            jSONObject.put("EnableOnlyHttpsUseCurl", false);
            if (z18) {
                jSONObject.put("key_localserver_buffer_size", 524288L);
                jSONObject.put("key_localserver_send_socket_buffer_size", 131072L);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            tPDownloadProxy.init(applicationContext, new com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam(com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform(), com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(applicationContext), com.tencent.thumbplayer.config.TPPlayerConfig.getGuid(), i17, i18, jSONObject2));
            if (z17) {
                tPDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAX_USE_MEMORY_MB, 5);
            }
            tPDownloadProxy.setMaxStorageSizeMB(512L);
        }
    }

    public final void e(java.lang.String str, long j17) {
        try {
            java.lang.String a17 = a(str);
            if (r26.n0.N(a17)) {
                return;
            }
            ((com.tencent.mm.sdk.platformtools.o4) c().i()).B(a17, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ThumbPlayerInitLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
