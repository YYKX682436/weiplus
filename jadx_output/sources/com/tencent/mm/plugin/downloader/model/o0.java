package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class o0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.p0 f97094d;

    public o0(com.tencent.mm.plugin.downloader.model.p0 p0Var) {
        this.f97094d = p0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        com.tencent.mm.plugin.downloader.model.p0 p0Var = this.f97094d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "yyb_pkg_sig_prefs", 4)).getString(p0Var.f97106d.field_packageName, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded sig[%s]", string);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(322L, 26L, 1L, false);
                h02.a aVar = p0Var.f97106d;
                g0Var.d(11098, 4026, java.lang.String.format("%s,%s", aVar.field_packageName, aVar.field_filePath));
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    java.lang.String j17 = com.tencent.mm.plugin.downloader.model.r0.j(p0Var.f97106d.field_filePath);
                    if (!p0Var.f97108f.getPackageName().equalsIgnoreCase(j17) || j62.e.g().a("clicfg_appcompat_pkg_sig", "0", false, true).equals("1")) {
                        uk.f.d(new java.io.File(com.tencent.mm.vfs.w6.i(p0Var.f97106d.field_filePath, true)), string);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "Skip writing apkSig for v2 signing, pkg = " + j17);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode done");
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var2.idkeyStat(322L, 25L, 1L, false);
                    h02.a aVar2 = p0Var.f97106d;
                    g0Var2.d(11098, 4025, java.lang.String.format("%s,%s,%s", aVar2.field_packageName, aVar2.field_filePath, string));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode e: " + e17.getMessage());
                    com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var3.idkeyStat(322L, 27L, 1L, false);
                    h02.a aVar3 = p0Var.f97106d;
                    g0Var3.d(11098, 4027, java.lang.String.format("%s,%s,%s", aVar3.field_packageName, aVar3.field_filePath, e17.getMessage()));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded get pkg sig error");
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.idkeyStat(322L, 28L, 1L, false);
            h02.a aVar4 = p0Var.f97106d;
            g0Var4.d(11098, 4028, java.lang.String.format("%s,%s,%d,%d", aVar4.field_packageName, aVar4.field_filePath, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f97106d.field_appId) && com.tencent.mm.pluginsdk.model.app.w.t(p0Var.f97106d.field_appId)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "onSceneEnd, fail, appId: %s", p0Var.f97106d.field_appId);
                g0Var4.idkeyStat(710L, 24L, 1L, false);
            }
        }
        com.tencent.mm.plugin.downloader.model.r0 r0Var = p0Var.f97110h;
        h02.a aVar5 = p0Var.f97106d;
        boolean z17 = p0Var.f97109g;
        r0Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.q0(r0Var, aVar5, z17));
    }
}
