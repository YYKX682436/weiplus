package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes15.dex */
public final class p implements com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f94403c;

    public p(java.lang.String str, java.lang.String str2, long j17) {
        this.f94401a = str;
        this.f94402b = str2;
        this.f94403c = j17;
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizVideoPreloadLogic", "preloadTTPlayer  onPrepareDownloadProgressUpdate   fileId:" + this.f94401a + "   playableDurationMS:" + i17 + "  currentDownloadSizeByte：" + j17 + "   totalFileSizeByte:" + j18);
        com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a.e(this.f94402b, j17);
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareError() {
        com.tencent.mars.xlog.Log.e("MicroMsg.BizVideoPreloadLogic", "preloadTTPlayer  onPrepareError  fileId:" + this.f94401a);
        com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a.e(this.f94402b, 0L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 53L, 1L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:14:0x0023, B:9:0x0030), top: B:13:0x0023 }] */
    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPrepareSuccess() {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "preloadTTPlayer  onPrepareSuccess  fileId:"
            r0.<init>(r1)
            java.lang.String r1 = r12.f94401a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.BizVideoPreloadLogic"
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.plugin.appbrand.video.player.thumb.p r0 = com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a
            java.lang.String r2 = r12.f94402b
            long r3 = r12.f94403c
            r0.e(r2, r3)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            boolean r4 = r26.n0.N(r1)     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L2a
            goto L2c
        L2a:
            r4 = r3
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L30
            goto L57
        L30:
            com.tencent.mm.sdk.platformtools.v3 r0 = r0.c()     // Catch: java.lang.Exception -> L4d
            java.lang.Object r0 = r0.i()     // Catch: java.lang.Exception -> L4d
            com.tencent.mm.sdk.platformtools.o4 r0 = (com.tencent.mm.sdk.platformtools.o4) r0     // Catch: java.lang.Exception -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "su"
            r4.<init>(r5)     // Catch: java.lang.Exception -> L4d
            r4.append(r1)     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L4d
            r0.G(r1, r2)     // Catch: java.lang.Exception -> L4d
            goto L57
        L4d:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            java.lang.String r3 = ""
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r1)
        L57:
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r5 = 1379(0x563, double:6.813E-321)
            r7 = 52
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.p.onPrepareSuccess():void");
    }
}
