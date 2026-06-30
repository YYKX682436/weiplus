package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class bg {
    public bg(kotlin.jvm.internal.i iVar) {
    }

    public final void a(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(key, "key");
        try {
            obj.put(key, obj2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e17, "put with key(" + key + ')', new java.lang.Object[0]);
        }
    }
}
