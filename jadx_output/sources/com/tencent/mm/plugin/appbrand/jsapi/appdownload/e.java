package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.i f78950b;

    public e(com.tencent.mm.plugin.appbrand.jsapi.appdownload.i iVar, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f78950b = iVar;
        this.f78949a = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState) {
            com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = (com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState) obj;
            com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78949a;
            if (e9Var != null) {
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i iVar = this.f78950b;
                iVar.u(e9Var);
                iVar.f82374f = appBrandDownloadState.a().toString();
                iVar.m();
            }
        }
    }
}
