package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes15.dex */
public final class p implements com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f175936c;

    public p(java.lang.String str, java.lang.String str2, long j17) {
        this.f175934a = str;
        this.f175935b = str2;
        this.f175936c = j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener
    /* renamed from: onPrepareDownloadProgressUpdate */
    public void mo54380x8ea30446(int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", "preloadTTPlayer  onPrepareDownloadProgressUpdate   fileId:" + this.f175934a + "   playableDurationMS:" + i17 + "  currentDownloadSizeByte：" + j17 + "   totalFileSizeByte:" + j18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a.e(this.f175935b, j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener
    /* renamed from: onPrepareError */
    public void mo54381xfaf06cc0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizVideoPreloadLogic", "preloadTTPlayer  onPrepareError  fileId:" + this.f175934a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a.e(this.f175935b, 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 53L, 1L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:14:0x0023, B:9:0x0030), top: B:13:0x0023 }] */
    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener
    /* renamed from: onPrepareSuccess */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo54382xe9650cbb() {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "preloadTTPlayer  onPrepareSuccess  fileId:"
            r0.<init>(r1)
            java.lang.String r1 = r12.f175934a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.BizVideoPreloadLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            com.tencent.mm.plugin.appbrand.video.player.thumb.p r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a
            java.lang.String r2 = r12.f175935b
            long r3 = r12.f175936c
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
            com.tencent.mm.sdk.platformtools.o4 r0 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r0     // Catch: java.lang.Exception -> L4d
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r1)
        L57:
            com.tencent.mm.plugin.report.service.g0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r5 = 1379(0x563, double:6.813E-321)
            r7 = 52
            r9 = 1
            r11 = 0
            r4.mo68477x336bdfd8(r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.p.mo54382xe9650cbb():void");
    }
}
