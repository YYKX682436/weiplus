package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class f implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.i f78957e;

    public f(com.tencent.mm.plugin.appbrand.jsapi.appdownload.i iVar, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f78957e = iVar;
        this.f78956d = e9Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.DESTROYED) {
            com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78956d;
            com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(e9Var.getAppId(), this.f78957e.f78960i);
            com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.A(e9Var);
        }
    }
}
