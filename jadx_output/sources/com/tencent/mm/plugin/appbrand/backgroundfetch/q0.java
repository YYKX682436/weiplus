package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class q0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.l0 f76888d;

    public q0(com.tencent.mm.plugin.appbrand.ipc.l0 l0Var) {
        this.f76888d = l0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.DESTROYED) {
            com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(str, this.f76888d);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app stop listening background fetched data event, appId:%s", str);
        }
    }
}
