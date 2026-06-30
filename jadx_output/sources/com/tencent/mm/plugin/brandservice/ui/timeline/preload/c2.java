package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes5.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2 f94203a = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f94204b = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b2.f94191d);

    public static final java.lang.String b(java.lang.String url) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.String) ((jz5.n) f94204b).getValue());
        sb6.append("pic_");
        try {
            str = com.tencent.mm.sdk.platformtools.w2.a(java.net.URLDecoder.decode(android.net.Uri.parse(url).buildUpon().clearQuery().build().toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebImagePreloadLogic", "parse url fail: " + e17.getMessage());
            str = null;
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final java.io.InputStream a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        kotlin.jvm.internal.o.d(str);
        java.lang.String b17 = b(str);
        if (com.tencent.mm.vfs.w6.j(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebImagePreloadLogic", "get cachePath ok, url = " + str + ", path = " + b17);
            return com.tencent.mm.vfs.w6.E(b17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebImagePreloadLogic", "get cachePath fail, url = " + str + ", path = " + b17);
        return null;
    }

    public final void c(java.util.List list, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadPics, length = ");
        kotlin.jvm.internal.o.d(list);
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebImagePreloadLogic", sb6.toString());
        for (java.lang.String str : kz5.n0.K0(list, 3)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            o11.f fVar = new o11.f();
            fVar.f342078b = true;
            fVar.f342077a = false;
            fVar.f342082f = b(str);
            n11.a.b().i(str, null, fVar.a(), new com.tencent.mm.plugin.brandservice.ui.timeline.preload.a2(currentTimeMillis, null));
        }
    }
}
