package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class y1 implements com.p314xaae8f345.mm.p669x38b6e557.h5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1 w1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class));
        w1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP", "DUMP_BITMAP");
        pb0.g.b(new yz5.p() { // from class: com.tencent.mm.feature.performance.w1$$f
            @Override // yz5.p
            /* renamed from: invoke */
            public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                pb0.a aVar = (pb0.a) obj2;
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1 w1Var2 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1.this;
                w1Var2.getClass();
                long a17 = aVar.a();
                w1Var2.f149287d += aVar.size();
                w1Var2.f149288e += a17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP", "count: %s, sum byte count: %s, %s\n trace: %s", java.lang.Integer.valueOf(aVar.size()), java.lang.Long.valueOf(a17), aVar, (java.lang.String) obj);
                return null;
            }
        });
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP", "total bitmap count = %s, total bitmap byte count = %s", java.lang.Integer.valueOf(w1Var.f149287d), java.lang.Long.valueOf(w1Var.f149288e));
    }
}
