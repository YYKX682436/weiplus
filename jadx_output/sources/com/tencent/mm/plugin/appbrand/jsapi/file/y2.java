package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class y2 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile;
        java.lang.String optString = jSONObject.optString("destPath");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, "fail no such file or directory, copyFile \"%s\" -> \"%s\"", str, optString);
        java.lang.String format2 = java.lang.String.format(locale, "fail permission denied, copyFile \"%s\" -> \"%s\"", str, optString);
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(str);
        boolean canSaveToLocal = lVar.getFileSystem().canSaveToLocal(str);
        if (absoluteFile != null && absoluteFile.m() && absoluteFile.A()) {
            if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(absoluteFile)) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" not a regular file", str);
            }
            writeFile = lVar.getFileSystem().copyTo(optString, absoluteFile, false);
        } else {
            if (!canSaveToLocal) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(format2, new java.lang.Object[0]);
            }
            ik1.b0 b0Var = new ik1.b0();
            lVar.getFileSystem().readFile(str, b0Var);
            if (b0Var.f291824a == null) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(format, new java.lang.Object[0]);
            }
            nf.a aVar = new nf.a((java.nio.ByteBuffer) b0Var.f291824a);
            writeFile = lVar.getFileSystem().writeFile(optString, aVar, false);
            com.tencent.mm.sdk.platformtools.t8.v1(aVar);
        }
        int ordinal = writeFile.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 10) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" is not a regular file", optString);
        }
        if (ordinal == 15) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail the maximum size of the file storage limit is exceeded", new java.lang.Object[0]);
        }
        if (ordinal == 2) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail sdcard not mounted", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(format, new java.lang.Object[0]);
        }
        if (ordinal == 4) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(format2, new java.lang.Object[0]);
        }
        if (ordinal == 5) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail illegal operation on a directory, open \"%s\"", optString);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + writeFile.name(), new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public java.lang.String c(org.json.JSONObject jSONObject) {
        return jSONObject.optString("srcPath");
    }
}
