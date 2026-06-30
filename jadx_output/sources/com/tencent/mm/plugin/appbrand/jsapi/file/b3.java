package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class b3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        if (lVar.getFileSystem() == null) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no file system", new java.lang.Object[0]);
        }
        java.lang.String optString = jSONObject.optString("compressionAlgorithm");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UnitReadCompressedFile", "call, path %s, compressionAlgorithm %s", str, optString);
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = lVar.getFileSystem().readFile(str, b0Var);
        if (readFile != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            int ordinal = readFile.ordinal();
            if (ordinal == 4) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
            }
            if (ordinal == 6) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file \"%s\"", str);
            }
            if (ordinal == 10) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" is not a regular file", str);
            }
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + readFile.name(), new java.lang.Object[0]);
        }
        if (!optString.equals("br")) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail invalid compressionAlgorithm \"%s\"", optString);
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.UnitReadCompressedFile$BrotliJNILibrary.INST.ensureNativeLibraryLoaded();
        byte[] decompress = com.tencent.mm.plugin.appbrand.appstorage.BrotliJNI.decompress((java.nio.ByteBuffer) b0Var.f291824a);
        if (decompress == null) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail brotli decompress file \"%s\"", str);
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(decompress.length);
        allocateDirect.put(decompress);
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var2 = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        ((java.util.HashMap) b0Var2.f81319a).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, allocateDirect);
        return b0Var2;
    }
}
