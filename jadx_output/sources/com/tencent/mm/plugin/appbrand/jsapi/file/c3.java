package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class c3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readDir = lVar.getFileSystem().readDir(str, b0Var);
        nf.c.b(linkedList, (java.util.List) b0Var.f291824a);
        int ordinal = readDir.ordinal();
        if (ordinal == 0) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.tencent.mm.plugin.appbrand.appstorage.h1) it.next()).f76193a);
            }
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var2 = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
            ((java.util.HashMap) b0Var2.f81319a).put("files", jSONArray);
            return b0Var2;
        }
        if (ordinal != 6) {
            if (ordinal == 8) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail not a directory \"%s\"", str);
            }
            if (ordinal == 10) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" is not a regular file", str);
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
                }
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + readDir.name(), new java.lang.Object[0]);
            }
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory \"%s\"", str);
    }
}
