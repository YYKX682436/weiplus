package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class c2 {
    public static java.lang.String a() {
        if (c01.z1.I()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_5);
        }
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.O() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_4) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.WalletWordingManager", "get wechat user wallet entry : %s", Ai);
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.O() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mew, Ai) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mev, Ai);
    }

    public static java.lang.String b() {
        return c01.z1.I() ? "R" : c01.z1.z() ? "HK$" : "¥";
    }

    public static java.lang.String c() {
        if (c01.z1.I()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2o);
        }
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ky7);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.WalletWordingManager", "get wechat user wallet entry : %s", Ai);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2y, Ai);
    }
}
