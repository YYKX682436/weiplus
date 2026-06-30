package p05;

/* loaded from: classes5.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.p2 f432171d = new p05.p2();

    public p2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wevision_run_score, false);
        p05.v2 v2Var = p05.v2.f432237d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = v2Var.Bi();
        p05.p3 p3Var = p05.p3.f432172a;
        boolean z17 = Bi.getBoolean("local_run_score", true);
        boolean z18 = v2Var.Bi().getBoolean("need_run_score", false);
        if (fj6 && z18 && z17) {
            v2Var.Bi().G("local_run_score", false);
            java.lang.String str = p05.v2.f432238e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkLocalRunScore: start");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k;
            double m83709x9b6d0414 = com.p314xaae8f345.mm.p2825x7e128009.C22968x1e5fd20e.m83709x9b6d0414();
            double m83710x9b6d2f84 = com.p314xaae8f345.mm.p2825x7e128009.C22968x1e5fd20e.m83710x9b6d2f84();
            v2Var.Bi().z("local_cpu_score", (float) m83709x9b6d0414);
            v2Var.Bi().z("lcoal_gpu_score", (float) m83710x9b6d2f84);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7128x5cc39ca5 c7128x5cc39ca5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7128x5cc39ca5();
            c7128x5cc39ca5.f144438d = (int) (m83709x9b6d0414 * 100.0d);
            c7128x5cc39ca5.f144439e = (int) (m83710x9b6d2f84 * 100.0d);
            c7128x5cc39ca5.f144442h = c7128x5cc39ca5.b("NeedBenchScore", z18 ? "YES" : "NO", true);
            if (z19) {
                c7128x5cc39ca5.f144440f = 64;
            } else {
                c7128x5cc39ca5.f144440f = 32;
            }
            c7128x5cc39ca5.f144443i = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkLocalRunScore: " + c7128x5cc39ca5.n());
            c7128x5cc39ca5.k();
        }
        return jz5.f0.f384359a;
    }
}
