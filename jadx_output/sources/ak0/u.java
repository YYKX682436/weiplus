package ak0;

/* loaded from: classes11.dex */
public final class u extends pv5.b {
    @Override // pv5.b, pv5.c
    public int a(java.lang.String str) {
        if (ak0.x.f5548k) {
            try {
                this.f358622a.stopService(new android.content.Intent(this.f358622a, (java.lang.Class<?>) com.tencent.tinker.lib.service.TinkerPatchService.class));
            } catch (java.lang.Throwable th6) {
                ak0.l.a("MicroMsg.HotPatch.LegacyCore", "[-] onPatchReceived throws exception " + th6.getMessage());
            }
        }
        return super.a(str);
    }

    @Override // pv5.b
    public int b(java.lang.String str, java.lang.String str2) {
        int b17 = super.b(str, str2);
        if (b17 == 0) {
            java.io.File file = new java.io.File(str);
            java.util.Iterator it = ak0.n.f5541a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b17 = 0;
                    break;
                }
                int a17 = ((ak0.m) it.next()).a(file);
                if (a17 != 0) {
                    b17 = a17;
                    break;
                }
            }
            if (b17 == 0) {
                b17 = 0;
            }
        }
        java.io.File file2 = new java.io.File(str);
        java.util.Iterator it6 = ak0.o.f5544c.iterator();
        while (it6.hasNext()) {
            ((nq1.x$$a) ((ak0.d) it6.next())).getClass();
            ak0.e a18 = ak0.g.a(file2);
            if (a18 != null) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193111g;
                java.util.Properties properties = ((ak0.f) a18).f5537a;
                y73.z.a(str3, properties.getProperty("patch.client.ver"), properties.getProperty(com.tencent.tinker.loader.shareutil.ShareConstants.NEW_TINKER_ID), 2, b17 == 0 ? 1 : 0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.HotPatch.Init.Process.Default", "patchCheck properties is null.");
            }
            boolean z17 = b17 == 0;
            com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.y(338, 2, 71, false);
            if (z17) {
                g0Var.idkeyStat(338L, 7L, 1L, true);
            }
        }
        return b17;
    }
}
