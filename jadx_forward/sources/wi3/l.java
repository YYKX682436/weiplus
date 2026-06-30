package wi3;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final wi3.l f527759a = new wi3.l();

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f527760b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f527761c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f527762d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f527763e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Runnable f527764f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f527765g;

    static {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(new wi3.c());
        f527764f = wi3.k.f527758d;
        f527765g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public static final float[] a(wi3.l lVar, long j17, java.nio.Buffer buffer, int i17, int i18) {
        lVar.getClass();
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFGWrapper", "ptr is null");
            return new float[0];
        }
        float[] m47825xf386fe21 = com.p314xaae8f345.mm.p936x333261.C11099x242a61.m47825xf386fe21(j17, buffer, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m47825xf386fe21, "nProcess(...)");
        return m47825xf386fe21;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0126 -> B:10:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(wi3.l r22, java.lang.String r23, float[] r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi3.l.b(wi3.l, java.lang.String, float[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "makeSureInit: mmfgPtr=" + f527760b);
        wi3.l lVar = f527759a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f527765g;
        java.lang.Runnable runnable = f527764f;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 180000L);
        if (f527760b != 0) {
            return true;
        }
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.a3 a3Var = p05.a3.f431972a;
        java.lang.String g17 = a3Var.g("MODEL_MMFG1");
        java.lang.String g18 = a3Var.g("MODEL_MMFG2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "modelPath1:" + g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "modelPath2:" + g18);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(g17, g18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFGWrapper", "model Path null!");
            return false;
        }
        synchronized (lVar) {
            if (f527760b == 0) {
                f527760b = com.p314xaae8f345.mm.p936x333261.C11099x242a61.m47824x630f29e(g17, g18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "MMFG.nInit: mmfgPtr=" + f527760b);
            }
        }
        return f527760b != 0;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "delayRelease");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f527765g;
        java.lang.Runnable runnable = f527764f;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 3000L);
    }
}
