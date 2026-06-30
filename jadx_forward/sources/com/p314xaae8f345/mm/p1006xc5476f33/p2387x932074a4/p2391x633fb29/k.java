package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f262900a;

    public static int a() {
        java.lang.String str;
        if (!f262900a && gm0.j1.a()) {
            try {
                str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PatternLockTimeInterval");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLockInitTask", e17, "", new java.lang.Object[0]);
                str = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                hu4.c.f366757a = 300;
            } else {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
                if (P >= 0) {
                    java.lang.String.format("Dynamic config for PatternLockInterval override default config, newval=%d", java.lang.Integer.valueOf(P));
                    hu4.c.f366757a = P;
                } else {
                    hu4.c.f366757a = 300;
                }
            }
            f262900a = true;
        }
        return hu4.c.f366757a;
    }
}
