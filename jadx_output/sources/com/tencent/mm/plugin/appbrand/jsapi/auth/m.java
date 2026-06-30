package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class m implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.n f79633d;

    public m(com.tencent.mm.plugin.appbrand.jsapi.auth.n nVar) {
        this.f79633d = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.a aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthWithTimeoutListener", "timer expired timeout:" + this.f79633d.f79643f + " ms");
        com.tencent.mm.plugin.appbrand.jsapi.auth.n nVar = this.f79633d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.n0 n0Var = nVar.f79641d;
        com.tencent.mm.plugin.appbrand.jsapi.ff ffVar = nVar.f79642e;
        n0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BaseAuthJsApi", "AuthTimeout callback id:%d", java.lang.Integer.valueOf(ffVar.f81016e));
        n0Var.D(ffVar.f81013b, ffVar.f81016e, "fail:time out", jc1.f.f298916e);
        com.tencent.mm.plugin.appbrand.jsapi.auth.n nVar2 = this.f79633d;
        synchronized (nVar2) {
            nVar2.f79645h = true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.n nVar3 = this.f79633d;
        synchronized (nVar3) {
            aVar = nVar3.f79644g;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f79633d.f79646i = null;
        return false;
    }
}
