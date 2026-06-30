package c01;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c01.s0 f118963a = new c01.s0();

    public static final int a() {
        int o17 = f118963a.b().o("BizMassSendHideFlag", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendUtil", "getHideFlag = " + o17);
        return o17;
    }

    public static final boolean c() {
        if (!((a() & 1) != 0)) {
            return false;
        }
        if ((a() & 8) != 0) {
            if ((a() & 16) != 0) {
                return true;
            }
        }
        if ((a() & 8) != 0) {
            if ((a() & 32) != 0) {
                return true;
            }
        }
        if ((a() & 4) != 0) {
            return true;
        }
        return (a() & 64) != 0;
    }

    public static final boolean d() {
        c01.s0 s0Var = f118963a;
        if (s0Var.b().i("BizMassSendExperimentEverOpened", false)) {
            return true;
        }
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_conv_mass_send_hide_enable_android, 0) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendUtil", "experiment never opened");
            return false;
        }
        s0Var.b().G("BizMassSendExperimentEverOpened", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendUtil", "experiment is opened, set flag to true and allow write");
        return true;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("biz_masssend", gm0.j1.b().h(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        return J2;
    }
}
