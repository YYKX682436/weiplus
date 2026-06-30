package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class a0 implements ni.g {
    public a0(com.tencent.mm.matrix.b0 b0Var) {
    }

    public void a(java.util.List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixOpenGLLeakResultUI", "leak detected, start ui");
            new oh5.l().e(list);
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            oi.e eVar = (oi.e) list.get(i27);
            oi.b bVar = eVar == null ? null : eVar.f345560f;
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
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25641, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), valueOf, java.lang.String.valueOf(false), "", "", "");
    }
}
