package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class y1 implements com.tencent.mm.console.h5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        final com.tencent.mm.feature.performance.w1 w1Var = (com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class));
        w1Var.getClass();
        com.tencent.mars.xlog.Log.i("DUMP_BITMAP", "DUMP_BITMAP");
        pb0.g.b(new yz5.p() { // from class: com.tencent.mm.feature.performance.w1$$f
            @Override // yz5.p
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                pb0.a aVar = (pb0.a) obj2;
                com.tencent.mm.feature.performance.w1 w1Var2 = com.tencent.mm.feature.performance.w1.this;
                w1Var2.getClass();
                long a17 = aVar.a();
                w1Var2.f67754d += aVar.size();
                w1Var2.f67755e += a17;
                com.tencent.mars.xlog.Log.i("DUMP_BITMAP", "count: %s, sum byte count: %s, %s\n trace: %s", java.lang.Integer.valueOf(aVar.size()), java.lang.Long.valueOf(a17), aVar, (java.lang.String) obj);
                return null;
            }
        });
        com.tencent.mars.xlog.Log.i("DUMP_BITMAP", "total bitmap count = %s, total bitmap byte count = %s", java.lang.Integer.valueOf(w1Var.f67754d), java.lang.Long.valueOf(w1Var.f67755e));
    }
}
