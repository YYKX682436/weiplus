package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes13.dex */
public abstract class d {
    public static final void a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.appbrand.jsapi.AddTagWhenFavRequest addTagWhenFavRequest = new com.tencent.mm.plugin.appbrand.jsapi.AddTagWhenFavRequest();
        com.tencent.mm.plugin.appbrand.jsapi.c cVar = com.tencent.mm.plugin.appbrand.jsapi.c.f80143a;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(activity, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, addTagWhenFavRequest, cVar, null);
    }
}
