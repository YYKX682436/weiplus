package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class h3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    public static java.util.Map d(com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat, java.util.Map map) {
        map.put("mode", java.lang.Integer.valueOf(fileStructStat.st_mode));
        map.put("size", java.lang.Long.valueOf(fileStructStat.st_size));
        map.put("lastAccessedTime", java.lang.Long.valueOf(fileStructStat.st_atime));
        map.put("lastModifiedTime", java.lang.Long.valueOf(fileStructStat.st_mtime));
        return map;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("recursive", false);
        com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat = new com.tencent.mm.plugin.appbrand.appstorage.FileStructStat();
        com.tencent.mm.plugin.appbrand.appstorage.j1 stat = lVar.getFileSystem().stat(str, fileStructStat);
        int ordinal = stat.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6 || ordinal == 3) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory \"%s\"", str);
            }
            if (ordinal == 4) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
            }
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + stat.name(), new java.lang.Object[0]);
        }
        if (!fileStructStat.isDirectory() || !optBoolean) {
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
            java.util.HashMap hashMap = new java.util.HashMap();
            d(fileStructStat, hashMap);
            b0Var.a(hashMap);
            return b0Var;
        }
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.appstorage.h2> linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.appstorage.j1 statDir = lVar.getFileSystem().statDir(str, linkedList);
        if (statDir.ordinal() != 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + statDir.name(), new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var2 = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        for (com.tencent.mm.plugin.appbrand.appstorage.h2 h2Var : linkedList) {
            java.lang.String str2 = h2Var.f76194d;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            d(h2Var, hashMap2);
            ((java.util.HashMap) b0Var2.f81319a).put(str2, hashMap2);
        }
        return b0Var2;
    }
}
