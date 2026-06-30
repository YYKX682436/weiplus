package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.b1 f79815a = new com.tencent.mm.plugin.appbrand.jsapi.b1();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        com.tencent.mm.pluginsdk.model.app.m h17 = ((lt.i0) i95.n0.c(lt.i0.class)) != null ? com.tencent.mm.pluginsdk.model.app.w.h(str) : null;
        java.lang.String str2 = h17 != null ? h17.field_packageName : null;
        boolean f17 = str2 == null ? false : com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByAppId, theAppId: " + str + ", packageName: " + str2 + ", isInstalled: " + f17);
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(f17);
    }
}
