package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {
    public final void a(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.vfs.w6.h(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "cleanupTempFiles: deleted " + str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f150586h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskFailed id:" + j17 + ", errCode:" + i17);
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f) concurrentHashMap.remove(java.lang.Long.valueOf(j17));
            if (fVar != null) {
                com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
                c10919x62749ac7.f160312d = "download_failed";
                c10919x62749ac7.f160313e = j17;
                java.lang.String str = fVar.f150576a;
                c10919x62749ac7.f160314f = str;
                c10919x62749ac7.f150573s = "download_err_" + i17;
                java.lang.String str2 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c10919x62749ac7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r24, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.d.c(long, java.lang.String, boolean):void");
    }

    public final void d(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
        c10919x62749ac7.f160312d = "download_failed";
        c10919x62749ac7.f160313e = j17;
        c10919x62749ac7.f160314f = str;
        c10919x62749ac7.f150573s = str2;
        java.lang.String str3 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c10919x62749ac7);
    }

    public final void e(long j17, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar, java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
        c10919x62749ac7.f160312d = "download_succ";
        c10919x62749ac7.f160313e = j17;
        java.lang.String str2 = fVar.f150576a;
        c10919x62749ac7.f160314f = str2;
        c10919x62749ac7.f150567m = fVar.f150577b;
        c10919x62749ac7.f150568n = str;
        c10919x62749ac7.f150569o = fVar.f150578c;
        c10919x62749ac7.f150570p = fVar.f150579d;
        c10919x62749ac7.f150571q = z17;
        c10919x62749ac7.f150572r = i17;
        java.lang.String str3 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str2, c10919x62749ac7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String url, long j18, long j19) {
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f150586h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) && (fVar = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f) concurrentHashMap.get(java.lang.Long.valueOf(j17))) != null) {
            long j27 = j19 > 0 ? (100 * j18) / j19 : 0L;
            float f17 = j19 > 0 ? ((float) j18) / ((float) j19) : 0.0f;
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
            c10919x62749ac7.f160312d = "download_progress_changed";
            c10919x62749ac7.f160313e = j17;
            java.lang.String str = fVar.f150576a;
            c10919x62749ac7.f160314f = str;
            c10919x62749ac7.f160315g = j27;
            c10919x62749ac7.f160316h = j19;
            c10919x62749ac7.f160317i = f17;
            c10919x62749ac7.f150567m = fVar.f150577b;
            java.lang.String str2 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c10919x62749ac7);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String savedFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savedFilePath, "savedFilePath");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f150586h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskResumed id:" + j17 + ", savedFilePath:" + savedFilePath);
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (fVar == null) {
                return;
            }
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
            c10919x62749ac7.f160312d = "download_resumed";
            c10919x62749ac7.f160313e = j17;
            java.lang.String str = fVar.f150576a;
            c10919x62749ac7.f160314f = str;
            c10919x62749ac7.f150567m = fVar.f150577b;
            java.lang.String str2 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c10919x62749ac7);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f150586h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskPaused id:" + j17);
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (fVar == null) {
                return;
            }
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
            c10919x62749ac7.f160312d = "download_paused";
            c10919x62749ac7.f160313e = j17;
            java.lang.String str = fVar.f150576a;
            c10919x62749ac7.f160314f = str;
            c10919x62749ac7.f150567m = fVar.f150577b;
            java.lang.String str2 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c10919x62749ac7);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String savedFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savedFilePath, "savedFilePath");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f150586h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "onTaskStarted id:" + j17 + ", savedFilePath:" + savedFilePath);
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (fVar == null) {
                return;
            }
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7();
            c10919x62749ac7.f160312d = "download_started";
            c10919x62749ac7.f160313e = j17;
            java.lang.String str = fVar.f150576a;
            c10919x62749ac7.f160314f = str;
            c10919x62749ac7.f150567m = fVar.f150577b;
            java.lang.String str2 = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.f29757x24728b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c10919x62749ac7);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f150586h;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        }
    }
}
