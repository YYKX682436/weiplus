package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public abstract class d {
    public static final void a(android.content.Context context, yz5.l block) {
        kotlin.jvm.internal.o.g(block, "block");
        int hashCode = block.hashCode();
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.a.f85598a;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.a.f85598a.put(block.hashCode(), block);
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            com.tencent.mm.plugin.appbrand.ipc.d.b(context, new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest(hashCode), null);
        } else {
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest proxyRequest = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest(hashCode);
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, proxyRequest, null, null);
        }
    }
}
