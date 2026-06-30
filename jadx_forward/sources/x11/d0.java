package x11;

/* loaded from: classes12.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a() {
        try {
            return java.lang.Runtime.getRuntime().availableProcessors();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "getCpuCoreNum err", new java.lang.Object[0]);
            return -1;
        }
    }

    public final long b() {
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "getMemorySize err", new java.lang.Object[0]);
            return -1L;
        }
    }

    public final void c(java.lang.String str, long j17) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "reportClickAuth() called sessionId:" + str);
            int a17 = a();
            long b17 = b();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55 c6790x79ba4f55 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55();
            c6790x79ba4f55.f141220d = c6790x79ba4f55.b("reversion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
            c6790x79ba4f55.f141233q = c6790x79ba4f55.b("sessionid", str, true);
            c6790x79ba4f55.f141234r = a17;
            c6790x79ba4f55.f141235s = b17;
            x11.e0[] e0VarArr = x11.e0.f532890d;
            c6790x79ba4f55.f141232p = 4;
            x11.b0.f532883a.a(c6790x79ba4f55, java.lang.Long.valueOf(j17));
            c6790x79ba4f55.k();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
    }
}
