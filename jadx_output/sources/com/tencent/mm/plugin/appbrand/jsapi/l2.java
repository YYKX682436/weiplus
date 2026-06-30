package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class l2<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.l2 f81362a = new com.tencent.mm.plugin.appbrand.jsapi.l2();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null) {
            i17 = Integer.MIN_VALUE;
        } else {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 6, str);
            doFavoriteEvent.e();
            i17 = doFavoriteEvent.f54091h.f6433a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteMainProcess, ret: " + i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteMainProcess, result: " + i17);
        return new com.tencent.mm.ipcinvoker.type.IPCInteger(i17);
    }
}
