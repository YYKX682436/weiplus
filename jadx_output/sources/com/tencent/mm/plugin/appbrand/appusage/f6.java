package com.tencent.mm.plugin.appbrand.appusage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appusage/f6;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/appbrand/appusage/AppIdentity;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class f6 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.appusage.AppIdentity appIdentity = (com.tencent.mm.plugin.appbrand.appusage.AppIdentity) obj;
        if (!gm0.j1.a() || appIdentity == null) {
            z17 = false;
        } else {
            com.tencent.mm.plugin.appbrand.appusage.a0 a0Var = com.tencent.mm.plugin.appbrand.appusage.b0.f76388a;
            z17 = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(appIdentity.f76359d, appIdentity.f76360e);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
    }
}
