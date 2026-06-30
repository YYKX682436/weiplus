package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class b0 implements li.e {
    public b0(com.tencent.mm.matrix.o oVar) {
    }

    public void a() {
        java.util.concurrent.TimeUnit timeUnit;
        long j17;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1403L, 38L, 1L);
        com.tencent.mars.xlog.Log.e("OpenglLeakPlugin.TAG", "onHookSuccess call & report");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            j17 = 2;
        } else {
            timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            j17 = 15;
        }
        ni.i iVar = new ni.i(timeUnit.toMillis(j17));
        iVar.f337181g = new com.tencent.mm.matrix.z(this);
        iVar.a((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext());
        iVar.f337182h = new com.tencent.mm.matrix.a0(this);
    }
}
