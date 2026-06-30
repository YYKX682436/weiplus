package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class f1 {
    public f1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.j0 a(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String TAG, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        kotlin.jvm.internal.o.g(TAG, "TAG");
        java.lang.String optString = jSONObject != null ? jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME) : null;
        com.tencent.mars.xlog.Log.i(TAG, "invokeSync with filename:" + optString + ", appId:" + yVar.getAppId());
        if (optString == null || optString.length() == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.j0("fail:invalid data", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = yVar.x();
        if (x17 == null) {
            com.tencent.mars.xlog.Log.e(TAG, "invokeSync get NULL reader, appId:" + yVar.getAppId());
            return new com.tencent.mm.plugin.appbrand.jsapi.j0("fail:internal error", new java.lang.Object[0]);
        }
        java.io.InputStream a17 = x17.a(optString);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e(TAG, "invokeSync filename(" + optString + ") not found, appId:" + yVar.getAppId());
            return new com.tencent.mm.plugin.appbrand.jsapi.j0("fail:file doesn't exist", new java.lang.Object[0]);
        }
        try {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(a17.available());
            if (a17 instanceof nf.a) {
                allocateDirect.put(((nf.a) a17).f336572d);
            } else {
                allocateDirect.put(java.nio.ByteBuffer.wrap(ik1.f.b(a17)));
            }
            kotlin.jvm.internal.o.d(allocateDirect);
            com.tencent.mm.plugin.appbrand.jsapi.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.j0("ok", new java.lang.Object[0]);
            ((java.util.HashMap) j0Var.f81319a).put("arrayBuffer", allocateDirect);
            vz5.b.a(a17, null);
            return j0Var;
        } finally {
        }
    }
}
