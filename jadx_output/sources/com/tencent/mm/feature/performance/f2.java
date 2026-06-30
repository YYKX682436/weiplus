package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class f2 implements ki.a {
    public f2(com.tencent.mm.feature.performance.c2 c2Var) {
    }

    @Override // ki.a
    public void a(int i17) {
        c();
    }

    @Override // ki.a
    public void b() {
        c();
    }

    public final void c() {
        if (!fp.q.b("xperf")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "xperf Expansion NOT installed");
            return;
        }
        try {
            int d17 = com.tencent.matrix.mallctl.MallCtl.d();
            int i17 = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "doMallOpt = %d", java.lang.Integer.valueOf(d17));
            if (d17 == -2) {
                i17 = 4;
            } else if (d17 == -1) {
                i17 = 3;
            } else if (d17 == 0) {
                i17 = 0;
            } else if (d17 != 1) {
                i17 = -1;
            }
            jx3.f.INSTANCE.t(1939, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginPerformance", th6, "doMallOpt failed", new java.lang.Object[0]);
        }
    }
}
