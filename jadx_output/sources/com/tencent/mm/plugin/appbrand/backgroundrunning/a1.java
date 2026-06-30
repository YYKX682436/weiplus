package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public final class a1 implements com.tencent.mm.ipcinvoker.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.b1 f76950e;

    public a1(com.tencent.mm.plugin.appbrand.backgroundrunning.b1 b1Var, java.lang.String str) {
        this.f76950e = b1Var;
        this.f76949d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.t0
    public void h() {
        java.lang.String str = this.f76949d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onDisconnected, process:%s", str);
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
        appBrandBackgroundRunningOperationParcel.f76940o = str;
        appBrandBackgroundRunningOperationParcel.f76935g = 3;
        this.f76950e.Di(appBrandBackgroundRunningOperationParcel);
    }
}
