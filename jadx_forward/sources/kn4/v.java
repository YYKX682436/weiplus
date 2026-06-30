package kn4;

/* loaded from: classes8.dex */
public final class v extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kn4.v f391287a = new kn4.v();

    /* renamed from: b, reason: collision with root package name */
    public static long f391288b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f391289c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f391290d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f391291e = false;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f391292f = "Unknown";

    @Override // gp1.a0, gp1.z
    public void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoReplaced replacedScene: ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.h() : null);
        sb6.append(" targetScene: ");
        sb6.append(c12886x91aa2b6d2 != null ? c12886x91aa2b6d2.h() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null && b(c12886x91aa2b6d)) {
            f391291e = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f391290d;
            long c17 = c(currentTimeMillis);
            if (c17 > 0) {
                f391289c += c17;
                f391288b += currentTimeMillis;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", "onFloatBallInfoRemoved scene: " + c12886x91aa2b6d.h() + ", duration=" + currentTimeMillis + ", predictTraffic=" + c17);
        }
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallDeleteButtonClick scene: ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.h() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoExposed scene: ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.h() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick scene: ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.h() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null && b(c12886x91aa2b6d)) {
            f391290d = java.lang.System.currentTimeMillis();
            f391292f = "<" + c12886x91aa2b6d.h() + '>';
            f391291e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", "onFloatBallInfoAdded scene: ".concat(c12886x91aa2b6d.h()));
        }
    }

    @Override // gp1.a0, gp1.z
    public boolean Y0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddMessageFloatBall scene: ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.h() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", sb6.toString());
        return false;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.Integer valueOf = c12886x91aa2b6d != null ? java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d) : null;
        return ((((((valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 35)) || (valueOf != null && valueOf.intValue() == 21)) || (valueOf != null && valueOf.intValue() == 34)) || (valueOf != null && valueOf.intValue() == 24)) || (valueOf != null && valueOf.intValue() == 32)) || (valueOf != null && valueOf.intValue() == 22);
    }

    public final long c(long j17) {
        if (j17 <= 0) {
            return 0L;
        }
        java.util.Map map = kn4.n0.f391263a;
        if (!((java.util.HashMap) map).containsKey(f391292f)) {
            return 0L;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(((java.util.HashMap) map).get(f391292f));
        return (long) (((java.lang.Number) r0).longValue() * ((j17 / 1000) / 60));
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBallInfo", "onFloatBallInfoClicked scene: ".concat(c12886x91aa2b6d.h()));
    }
}
