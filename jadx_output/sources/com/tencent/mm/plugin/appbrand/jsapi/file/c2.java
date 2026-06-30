package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class c2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 51;
    public static final java.lang.String NAME = "saveFile";

    public static com.tencent.mm.plugin.appbrand.jsapi.j0 C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("tempFilePath");
        java.lang.String optString2 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(optString);
        jc1.d dVar = jc1.e.f298911g;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
            return new com.tencent.mm.plugin.appbrand.jsapi.j0(dVar, new java.lang.Object[0]);
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null || !absoluteFile.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveFile", "fail tempFilePath file not exist");
            return new com.tencent.mm.plugin.appbrand.jsapi.j0(dVar, new java.lang.Object[0]);
        }
        ik1.b0 b0Var = new ik1.b0();
        jc1.d D = D(lVar, absoluteFile, optString2, b0Var);
        java.util.HashMap hashMap = new java.util.HashMap();
        if ("ok".equals(D.f298904b)) {
            hashMap.put("savedFilePath", b0Var.f291824a);
        }
        com.tencent.mm.plugin.appbrand.jsapi.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.j0(D, new java.lang.Object[0]);
        ((java.util.HashMap) j0Var.f81319a).putAll(hashMap);
        return j0Var;
    }

    public static jc1.d D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        boolean z17;
        if (r6Var == null || !r6Var.m()) {
            return jc1.e.f298905a;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 isdir = lVar.getFileSystem().isdir(str);
        if (isdir != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            try {
                ik1.b0 b0Var2 = new ik1.b0();
                com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile = lVar.getFileSystem().saveFile(r6Var, str, b0Var2);
                if (b0Var != null) {
                    b0Var.f291824a = b0Var2.f291824a;
                }
                z17 = false;
                isdir = saveFile;
            } catch (java.lang.Exception e17) {
                return new jc1.d(-1, "fail:saveFile exception: " + e17.toString());
            }
        } else {
            z17 = true;
        }
        int ordinal = isdir.ordinal();
        if (ordinal == 0) {
            return z17 ? new jc1.d(1301003, java.lang.String.format("%s, \"%s\"", "fail:illegal operation on a directory", str)) : jc1.f.f298912a;
        }
        if (ordinal == 9) {
            return new jc1.d(1301003, java.lang.String.format("%s, \"%s\"", "fail:illegal operation on a directory", str));
        }
        if (ordinal == 15) {
            return jc1.e.f298909e;
        }
        if (ordinal == 17) {
            return jc1.e.f298908d;
        }
        if (ordinal == 3) {
            return new jc1.d(1300002, java.lang.String.format("%s, \"%s\"", "fail:No such file or directory", str));
        }
        if (ordinal == 4) {
            return jc1.e.f298907c;
        }
        return new jc1.d(-1, "fail " + isdir.name());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.file.l.f81089h.execute(new com.tencent.mm.plugin.appbrand.jsapi.file.b2(this, lVar, jSONObject, i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
