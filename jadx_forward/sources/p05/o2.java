package p05;

/* loaded from: classes5.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.o2 f432164d = new p05.o2();

    public o2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.t87 t87Var = new r45.t87();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = p05.v2.f432237d.Bi();
        p05.p3 p3Var = p05.p3.f432172a;
        byte[] j17 = Bi.j("effect_config");
        if (j17 != null) {
            try {
                t87Var.mo11468x92b714fd(j17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        p05.v2 v2Var = p05.v2.f432237d;
        boolean z17 = false;
        v2Var.Ni(t87Var, false);
        new p05.b().l().K(p05.t2.f432225a);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi2 = v2Var.Bi();
        p05.p3 p3Var2 = p05.p3.f432172a;
        long j18 = Bi2.getLong("score_cgi_time", 0L);
        if (v2Var.Bi().f("cpu_score") && v2Var.Bi().f("gpu_score")) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p05.v2.f432238e, "loadDeviceScore: last:" + j18 + ", hasScore:" + z17);
        if (!z17 ? java.lang.System.currentTimeMillis() - j18 > p05.v2.f432240g : java.lang.System.currentTimeMillis() - j18 > p05.v2.f432239f) {
            new p05.a().l().K(p05.s2.f432220a);
        }
        return jz5.f0.f384359a;
    }
}
