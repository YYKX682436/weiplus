package ak0;

/* loaded from: classes11.dex */
public final class u extends pv5.b {
    @Override // pv5.b, pv5.c
    public int a(java.lang.String str) {
        if (ak0.x.f87081k) {
            try {
                this.f440155a.stopService(new android.content.Intent(this.f440155a, (java.lang.Class<?>) com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.class));
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
            java.util.Iterator it = ak0.n.f87074a.iterator();
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
        java.util.Iterator it6 = ak0.o.f87077c.iterator();
        while (it6.hasNext()) {
            ((nq1.C29220x371869) ((ak0.d) it6.next())).getClass();
            ak0.e a18 = ak0.g.a(file2);
            if (a18 != null) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
                java.util.Properties properties = ((ak0.f) a18).f87070a;
                y73.z.a(str3, properties.getProperty("patch.client.ver"), properties.getProperty(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55696xe7860e3c), 2, b17 == 0 ? 1 : 0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HotPatch.Init.Process.Default", "patchCheck properties is null.");
            }
            boolean z17 = b17 == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.y(338, 2, 71, false);
            if (z17) {
                g0Var.mo68477x336bdfd8(338L, 7L, 1L, true);
            }
        }
        return b17;
    }
}
