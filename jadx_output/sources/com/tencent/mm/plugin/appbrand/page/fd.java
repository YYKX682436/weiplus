package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class fd extends com.tencent.mm.plugin.appbrand.page.x9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ed f86621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.tencent.mm.plugin.appbrand.page.ed edVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        super(v5Var);
        this.f86621e = edVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.x9
    public void c(java.lang.String str) {
        if (!this.f86621e.f86582h) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "[perf] PageFrame[%s] ready cost %dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f86621e.f86589r));
        }
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.fd$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.page.fd fdVar = com.tencent.mm.plugin.appbrand.page.fd.this;
                if (fdVar.f86621e.f86587p.get()) {
                    return;
                }
                fdVar.f86621e.f86582h = true;
                fdVar.f86621e.u();
            }
        });
    }
}
