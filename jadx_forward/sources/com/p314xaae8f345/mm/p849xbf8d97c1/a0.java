package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class a0 implements ni.g {
    public a0(com.p314xaae8f345.mm.p849xbf8d97c1.b0 b0Var) {
    }

    public void a(java.util.List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixOpenGLLeakResultUI", "leak detected, start ui");
            new oh5.l().e(list);
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            oi.e eVar = (oi.e) list.get(i27);
            oi.b bVar = eVar == null ? null : eVar.f427093f;
            if (bVar != null) {
                if (eVar.c()) {
                    i18 = (int) (i18 + bVar.b());
                    if (!eVar.d()) {
                        i19 = (int) (i19 + bVar.b());
                    }
                } else {
                    i17 = (int) (i17 + bVar.b());
                }
            }
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i19);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25641, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), valueOf, java.lang.String.valueOf(false), "", "", "");
    }
}
