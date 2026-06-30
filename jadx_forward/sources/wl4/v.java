package wl4;

/* loaded from: classes11.dex */
public final class v implements rl4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final wl4.v f528636a = new wl4.v();

    @Override // rl4.c
    public void a() {
        h(bw5.ar0.TingScene_Minimization);
    }

    @Override // rl4.c
    public bw5.eq0 b() {
        return bw5.eq0.TingMusic;
    }

    @Override // rl4.c
    public int c() {
        return 64;
    }

    @Override // rl4.c
    public boolean d() {
        return false;
    }

    @Override // rl4.c
    public java.lang.String e() {
        return "default";
    }

    @Override // rl4.c
    public jm4.q3 f() {
        return jm4.q3.f381941g;
    }

    @Override // rl4.c
    public void g() {
        h(bw5.ar0.TingScene_SystemControl);
    }

    public final void h(bw5.ar0 enterScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 1002, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        ((rk4.k8) aj6).L(true);
        android.os.Bundle bundle = new android.os.Bundle();
        boolean wi6 = ((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).wi();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ep1.m.d(context, bundle, !wi6);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        qk.f9.b(aj6, context2, false, null, eVar, null, bundle, enterScene, null, 150, null);
    }
}
