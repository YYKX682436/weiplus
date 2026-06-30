package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class f2 implements ki.a {
    public f2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 c2Var) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "xperf Expansion NOT installed");
            return;
        }
        try {
            int d17 = com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.d();
            int i17 = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "doMallOpt = %d", java.lang.Integer.valueOf(d17));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginPerformance", th6, "doMallOpt failed", new java.lang.Object[0]);
        }
    }
}
