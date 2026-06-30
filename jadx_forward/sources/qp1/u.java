package qp1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final qp1.u f447276a = new qp1.u();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f447277b = jz5.h.b(qp1.s.f447274d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f447278c = jz5.h.b(qp1.t.f447275d);

    public final boolean a() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().f("key_float_ball_new_style") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("key_float_ball_new_style", false) : ((java.lang.Boolean) ((jz5.n) f447278c).mo141623x754a37bb()).booleanValue();
        }
        boolean booleanValue = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20560x107f11f0()) != 1 ? ((java.lang.Boolean) ((jz5.n) f447277b).mo141623x754a37bb()).booleanValue() : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallSwitchUtil", "floatBall new style: " + booleanValue);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("key_float_ball_new_style", booleanValue);
        return booleanValue;
    }
}
