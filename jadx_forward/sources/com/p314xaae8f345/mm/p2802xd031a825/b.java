package com.p314xaae8f345.mm.p2802xd031a825;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2802xd031a825.b f295326a;

    public static com.p314xaae8f345.mm.p2802xd031a825.b a() {
        if (f295326a == null) {
            f295326a = new com.p314xaae8f345.mm.p2802xd031a825.b();
        }
        return f295326a;
    }

    public boolean b() {
        return d(e42.d0.clicfg_open_kinda_bind_card, true);
    }

    public final boolean c(e42.c0 c0Var, boolean z17) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("kinda");
        if ("open".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274649l)) {
            return true;
        }
        if ("close".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274649l)) {
            return false;
        }
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_KindaConfigEnable_Int, 0);
        if (g17 == 1) {
            return true;
        }
        if (g17 == 2) {
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(c0Var, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TenPaySdkAbTest", "isKindaEnable svrConfig %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public final boolean d(e42.d0 d0Var, boolean z17) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("kinda");
        if ("open".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274649l)) {
            return true;
        }
        if ("close".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274649l)) {
            return false;
        }
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_KindaConfigEnable_Int, 0);
        if (g17 == 1) {
            return true;
        }
        if (g17 == 2) {
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(d0Var, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TenPaySdkAbTest", "isKindaEnable svrConfig %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public boolean e() {
        return d(e42.d0.clicfg_pay_security_kinda_switch_android, false);
    }

    public boolean f() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_tenpay_offline_cert_rsa_2048, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TenPaySdkAbTest", "isOfflineOpen2048 %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TenPaySdkAbTest", "isPwdOpen2048 %s", java.lang.Boolean.TRUE);
        return true;
    }
}
