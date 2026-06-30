package tb5;

/* loaded from: classes8.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a() {
        c25.e eVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("startup_cost_info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        int o17 = M.o("device_benchmark_level", Integer.MIN_VALUE);
        if (o17 != Integer.MIN_VALUE) {
            return o17;
        }
        int i17 = 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return 0;
        }
        try {
            eVar = (c25.e) gm0.j1.s(c25.e.class);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingFpsCollector", th6, "[tomys] Cannot get config value, return 0 as benchmark level.", new java.lang.Object[0]);
        }
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingFpsCollector", "[tomys] Cannot get config service on main process, return 0 as benchmark level.");
            return 0;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) eVar).b().b("ClientBenchmarkLevel", Integer.MIN_VALUE);
        if (b17 >= 0) {
            M.A("device_benchmark_level", b17);
            i17 = b17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingFpsCollector", "[tomys] Cannot get config value, return 0 as benchmark level.");
        }
        return i17;
    }
}
