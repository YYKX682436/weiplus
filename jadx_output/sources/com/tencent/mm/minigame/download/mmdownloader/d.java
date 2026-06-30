package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.plugin.downloader.model.g1 {
    public final void a(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.vfs.w6.h(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "cleanupTempFiles: deleted " + str);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.minigame.download.mmdownloader.g.f69053h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskFailed id:" + j17 + ", errCode:" + i17);
            com.tencent.mm.minigame.download.mmdownloader.f fVar = (com.tencent.mm.minigame.download.mmdownloader.f) concurrentHashMap.remove(java.lang.Long.valueOf(j17));
            if (fVar != null) {
                com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
                wVADownloadState.f78779d = "download_failed";
                wVADownloadState.f78780e = j17;
                java.lang.String str = fVar.f69043a;
                wVADownloadState.f78781f = str;
                wVADownloadState.f69040s = "download_err_" + i17;
                java.lang.String str2 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
                com.tencent.mm.plugin.appbrand.ipc.m0.b(str, wVADownloadState);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    @Override // com.tencent.mm.plugin.downloader.model.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r24, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.download.mmdownloader.d.c(long, java.lang.String, boolean):void");
    }

    public final void d(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
        wVADownloadState.f78779d = "download_failed";
        wVADownloadState.f78780e = j17;
        wVADownloadState.f78781f = str;
        wVADownloadState.f69040s = str2;
        java.lang.String str3 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
        com.tencent.mm.plugin.appbrand.ipc.m0.b(str, wVADownloadState);
    }

    public final void e(long j17, com.tencent.mm.minigame.download.mmdownloader.f fVar, java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
        wVADownloadState.f78779d = "download_succ";
        wVADownloadState.f78780e = j17;
        java.lang.String str2 = fVar.f69043a;
        wVADownloadState.f78781f = str2;
        wVADownloadState.f69034m = fVar.f69044b;
        wVADownloadState.f69035n = str;
        wVADownloadState.f69036o = fVar.f69045c;
        wVADownloadState.f69037p = fVar.f69046d;
        wVADownloadState.f69038q = z17;
        wVADownloadState.f69039r = i17;
        java.lang.String str3 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
        com.tencent.mm.plugin.appbrand.ipc.m0.b(str2, wVADownloadState);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String url, long j18, long j19) {
        com.tencent.mm.minigame.download.mmdownloader.f fVar;
        kotlin.jvm.internal.o.g(url, "url");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.minigame.download.mmdownloader.g.f69053h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) && (fVar = (com.tencent.mm.minigame.download.mmdownloader.f) concurrentHashMap.get(java.lang.Long.valueOf(j17))) != null) {
            long j27 = j19 > 0 ? (100 * j18) / j19 : 0L;
            float f17 = j19 > 0 ? ((float) j18) / ((float) j19) : 0.0f;
            com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
            wVADownloadState.f78779d = "download_progress_changed";
            wVADownloadState.f78780e = j17;
            java.lang.String str = fVar.f69043a;
            wVADownloadState.f78781f = str;
            wVADownloadState.f78782g = j27;
            wVADownloadState.f78783h = j19;
            wVADownloadState.f78784i = f17;
            wVADownloadState.f69034m = fVar.f69044b;
            java.lang.String str2 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(str, wVADownloadState);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String savedFilePath) {
        kotlin.jvm.internal.o.g(savedFilePath, "savedFilePath");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.minigame.download.mmdownloader.g.f69053h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskResumed id:" + j17 + ", savedFilePath:" + savedFilePath);
            com.tencent.mm.minigame.download.mmdownloader.f fVar = (com.tencent.mm.minigame.download.mmdownloader.f) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (fVar == null) {
                return;
            }
            com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
            wVADownloadState.f78779d = "download_resumed";
            wVADownloadState.f78780e = j17;
            java.lang.String str = fVar.f69043a;
            wVADownloadState.f78781f = str;
            wVADownloadState.f69034m = fVar.f69044b;
            java.lang.String str2 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(str, wVADownloadState);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.minigame.download.mmdownloader.g.f69053h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskPaused id:" + j17);
            com.tencent.mm.minigame.download.mmdownloader.f fVar = (com.tencent.mm.minigame.download.mmdownloader.f) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (fVar == null) {
                return;
            }
            com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
            wVADownloadState.f78779d = "download_paused";
            wVADownloadState.f78780e = j17;
            java.lang.String str = fVar.f69043a;
            wVADownloadState.f78781f = str;
            wVADownloadState.f69034m = fVar.f69044b;
            java.lang.String str2 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(str, wVADownloadState);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String savedFilePath) {
        kotlin.jvm.internal.o.g(savedFilePath, "savedFilePath");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.minigame.download.mmdownloader.g.f69053h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskStarted id:" + j17 + ", savedFilePath:" + savedFilePath);
            com.tencent.mm.minigame.download.mmdownloader.f fVar = (com.tencent.mm.minigame.download.mmdownloader.f) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (fVar == null) {
                return;
            }
            com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState();
            wVADownloadState.f78779d = "download_started";
            wVADownloadState.f78780e = j17;
            java.lang.String str = fVar.f69043a;
            wVADownloadState.f78781f = str;
            wVADownloadState.f69034m = fVar.f69044b;
            java.lang.String str2 = com.tencent.mm.minigame.download.mmdownloader.m.NAME;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(str, wVADownloadState);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.minigame.download.mmdownloader.g.f69053h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        }
    }
}
