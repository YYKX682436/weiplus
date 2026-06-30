package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class f3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        if (fileSystem == null) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail:internal error", new java.lang.Object[0]);
        }
        java.lang.String optString = jSONObject.optString("newPath");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, "fail no such file or directory, rename \"%s\" -> \"%s\"", str, optString);
        java.lang.String format2 = java.lang.String.format(locale, "fail permission denied, rename \"%s\" -> \"%s\"", str, optString);
        if (!fileSystem.canRenameFile(str)) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(format2, new java.lang.Object[0]);
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(str, true);
        if (absoluteFile == null || !absoluteFile.m()) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(format, new java.lang.Object[0]);
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(absoluteFile)) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" not a regular file", str);
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 copyTo = lVar.getFileSystem().copyTo(optString, absoluteFile, true);
        int ordinal = copyTo.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
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
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + copyTo.name(), new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public java.lang.String c(org.json.JSONObject jSONObject) {
        return jSONObject.optString("oldPath");
    }
}
