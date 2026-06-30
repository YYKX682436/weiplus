package com.tencent.mm.plugin.appbrand.appusage;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/plugin/appbrand/appusage/AppIdentity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class y<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.y f76652a = new com.tencent.mm.plugin.appbrand.appusage.y();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.appusage.AppIdentity appIdentity = (com.tencent.mm.plugin.appbrand.appusage.AppIdentity) obj;
        if (!gm0.j1.a() || appIdentity == null) {
            z17 = false;
        } else {
            com.tencent.mm.plugin.appbrand.appusage.a0 a0Var = com.tencent.mm.plugin.appbrand.appusage.b0.f76388a;
            z17 = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).Y1(appIdentity.f76359d, appIdentity.f76360e);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
    }
}
