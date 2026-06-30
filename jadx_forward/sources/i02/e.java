package i02;

/* loaded from: classes8.dex */
public class e implements com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i02.h f368041a;

    public e(i02.h hVar) {
        this.f368041a = hVar;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5
    /* renamed from: OnDownloadSDKTaskProgressChanged */
    public void mo104814x3a76d16f(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, java.lang.String str, long j17, long j18) {
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
            return;
        }
        i02.h hVar = this.f368041a;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) hVar.f368056j.get(f17.f68411x238eb002)));
        if (valueOf.longValue() == 0) {
            valueOf = java.lang.Long.valueOf(j17);
            hVar.f368056j.put(f17.f68411x238eb002, java.lang.Long.valueOf(j17));
        }
        long longValue = j17 - valueOf.longValue();
        if (j18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "onDownloadTaskProgressChanged, totalDataLen = 0");
        } else {
            int i17 = (int) ((((float) j17) / ((float) j18)) * 100.0f);
            if ((longValue * 100) / j18 >= 1) {
                long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hVar.f368057k.get(f17.f68411x238eb002), f17.f68440x1bb3b54a);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                k02.m.a(f17.f68408x32b20428, ((((float) longValue) * 1000.0f) / ((float) (currentTimeMillis - k17))) / 1048576.0f, i17);
                hVar.f368057k.put(f17.f68411x238eb002, java.lang.Long.valueOf(currentTimeMillis));
                hVar.f368056j.put(f17.f68411x238eb002, java.lang.Long.valueOf(j17));
            }
        }
        java.lang.Long l17 = (java.lang.Long) hVar.f368052f.get(str);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        if (l17 != null) {
            long longValue2 = valueOf2.longValue() - l17.longValue();
            if (longValue2 > 0 && longValue2 < 500) {
                return;
            }
        }
        hVar.f368052f.put(str, valueOf2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "onProgressChanged");
        i02.h.g(hVar, str, 2, (int) ((100 * j17) / j18), false);
        long j19 = f17.f68408x32b20428;
        h02.b g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
        if (g17 != null) {
            g17.m145253xb158737d("FileDownloadInfo", "update FileDownloadInfo set downloadedSize = " + j17 + ",totalSize= " + j18 + " where downloadId = " + j19);
        }
        hVar.f178745a.f(f17.f68408x32b20428, str, j17, j18);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5
    /* renamed from: OnDownloadSDKTaskStateChanged */
    public void mo104815xdbc24c3b(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 c26663xc1a70300;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "OnDownloadSDKTaskStateChanged State: " + i17 + " | ErrorCode: " + i18 + " | ErrorMsg: " + str2);
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(f17.f68408x32b20428);
        java.lang.String str3 = f17.f68419xf1e9b966;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "State: %d, Id: %d, Path: %s, File Exists: %b, URL: %s", valueOf, valueOf2, str3, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str3)), str);
        i02.h hVar = this.f368041a;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = hVar.d(f17.f68408x32b20428);
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hVar.f368057k.get(f17.f68411x238eb002), f17.f68440x1bb3b54a);
            long k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hVar.f368056j.get(f17.f68411x238eb002), f17.f68438x1bb3427e);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - k17;
            long j17 = d17.f178500m;
            k02.m.a(f17.f68408x32b20428, ((((float) (j17 - k18)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) j17) / ((float) d17.f178501n)) * 100.0f));
            hVar.f368056j.remove(f17.f68411x238eb002);
            hVar.f368057k.remove(f17.f68411x238eb002);
        }
        try {
            c26663xc1a70300 = hVar.j().m104830xc45041ae(f17.f68411x238eb002);
        } catch (java.lang.Exception unused) {
            c26663xc1a70300 = null;
        }
        if (i17 == 2) {
            f17.f68441x10a0fed7 = 1;
            if (c26663xc1a70300 != null) {
                f17.f68419xf1e9b966 = c26663xc1a70300.f56061xa9723acf;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
            return;
        }
        if (i17 == 3) {
            f17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
            f17.f68441x10a0fed7 = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
            hVar.h(str);
            hVar.f368054h.remove(java.lang.Long.valueOf(f17.f68408x32b20428));
            hVar.f178745a.e(f17.f68408x32b20428);
            return;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return;
            }
            if (i18 == 601 || i18 == 602 || i18 == 603 || i18 == 605 || i18 == 606) {
                hVar.f368059m.c(240000L, 240000L);
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && f17.f68409xc4f9be67) {
                f17.f68409xc4f9be67 = false;
                f17.f68431x4651c731 = false;
            }
            i02.h.g(hVar, str, i17, 0, false);
            hVar.f368054h.remove(java.lang.Long.valueOf(f17.f68408x32b20428));
            f17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
            f17.f68416x1c571ead = i18;
            f17.f68441x10a0fed7 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
            hVar.f178745a.c(f17.f68408x32b20428, i18, z17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Download Succeed event received");
        f17.f68441x10a0fed7 = 6;
        f17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
        long j18 = f17.f68443x78351860;
        f17.f68413xf432b5ad = j18;
        if (c26663xc1a70300 != null) {
            f17.f68419xf1e9b966 = c26663xc1a70300.f56061xa9723acf;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "download succeed, downloadedSize = %d, startSize = %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(f17.f68438x1bb3427e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
        hVar.f178745a.b(f17.f68408x32b20428);
        if (z18) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5583x6de909a9 c5583x6de909a9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5583x6de909a9();
            java.lang.String str4 = f17.f68404x28d45f97;
            am.ze zeVar = c5583x6de909a9.f135905g;
            zeVar.f90089a = str4;
            zeVar.f90090b = 6;
            c5583x6de909a9.e();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
        intent.setClass(hVar.f368050d, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, f17.f68408x32b20428);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178493q, z17);
        try {
            j45.l.A(intent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", e17.getMessage());
        }
        hVar.h(str);
        hVar.f368054h.remove(java.lang.Long.valueOf(f17.f68408x32b20428));
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5
    /* renamed from: OnDwonloadSDKServiceInvalid */
    public void mo104816x50d9dc65(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Service unavailable");
        i02.h hVar = this.f368041a;
        java.util.Iterator it = hVar.f368054h.iterator();
        while (it.hasNext()) {
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(((java.lang.Long) it.next()).longValue());
            if (c17 != null) {
                c17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
                c17.f68441x10a0fed7 = 4;
                c17.f68416x1c571ead = 101;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                hVar.f178745a.c(c17.f68408x32b20428, 101, false);
                i02.h.g(hVar, c17.f68411x238eb002, 5, 0, false);
            }
        }
        hVar.f368054h.clear();
    }
}
