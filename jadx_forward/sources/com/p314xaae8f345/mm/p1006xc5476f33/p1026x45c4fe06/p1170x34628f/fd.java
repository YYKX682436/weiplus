package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class fd extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed f168154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed edVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        super(v5Var);
        this.f168154e = edVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9
    public void c(java.lang.String str) {
        if (!this.f168154e.f168115h) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "[perf] PageFrame[%s] ready cost %dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f168154e.f168122r));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.fd$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fd fdVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fd.this;
                if (fdVar.f168154e.f168120p.get()) {
                    return;
                }
                fdVar.f168154e.f168115h = true;
                fdVar.f168154e.u();
            }
        });
    }
}
