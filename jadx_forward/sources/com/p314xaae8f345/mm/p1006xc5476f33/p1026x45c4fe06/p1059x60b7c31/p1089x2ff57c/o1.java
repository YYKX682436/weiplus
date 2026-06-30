package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class o1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34231x366c91de = 778;

    /* renamed from: NAME */
    private static final java.lang.String f34232x24728b = "private_fileSystemConvert";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: %s %s", f34232x24728b, jSONObject.toString());
        java.lang.String optString = jSONObject.optString("operationType", "");
        if (optString.equalsIgnoreCase("getAbsolutePath")) {
            java.lang.String optString2 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                lVar.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
                return;
            }
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, optString2);
                if (optString2.contains("wxfile://")) {
                    com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(optString2);
                    if (mo49620x1d537609 == null) {
                        lVar.a(i17, o("fail:file doesn't exist"));
                        lVar.a(i17, o(java.lang.String.format("fail: %s not exists", optString2)));
                        return;
                    }
                    jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, mo49620x1d537609.o());
                }
                lVar.a(i17, jSONObject2.toString());
                return;
            } catch (org.json.JSONException e17) {
                lVar.a(i17, o(java.lang.String.format("fail: error %s", e17.getMessage())));
                return;
            }
        }
        if (!optString.equalsIgnoreCase("getWxFilePath")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: invalid operate type: %s", optString);
            lVar.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
            return;
        }
        try {
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                optString3 = "private_fileSystemConvert_" + java.lang.System.currentTimeMillis();
            }
            java.lang.String optString4 = jSONObject.optString("mimeType");
            boolean optBoolean = jSONObject.optBoolean("autoDeleteIfExists", true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
                lVar.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
                return;
            }
            java.lang.String str = optString3 + "." + optString4;
            java.lang.String C = C(lVar, str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(C)) {
                lVar.a(i17, o("fail: getAbsoluteFile failed"));
                return;
            }
            if (optBoolean && com.p314xaae8f345.mm.vfs.w6.j(C)) {
                com.p314xaae8f345.mm.vfs.w6.h(C);
            }
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(C);
            com.p314xaae8f345.mm.vfs.w6.u(r17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: getWxFilePath, fileName: %s, relativeFilePath: %s, relativeFileName: %s, parentAbsolutePath: %s!", optString3, str, C, r17);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, C);
            jSONObject3.put(dm.i4.f66867x2a5c95c7, "wxfile://clientdata/" + str);
            lVar.a(i17, jSONObject3.toString());
        } catch (org.json.JSONException e18) {
            lVar.a(i17, o(java.lang.String.format("fail: error %s", e18.getMessage())));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiPrivateFileSystem", e18, "hy: json error!", new java.lang.Object[0]);
        }
    }

    public final java.lang.String C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (lVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(lVar == null);
            objArr[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: param error %b, %s", objArr);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2) lVar.mo50354x59eafec1();
        if (l2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: fs is null");
            return null;
        }
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) l2Var.a("wxfile://clientdata")).f157758d;
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2 + ".nomedia");
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: no nomedia file. trigger new");
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiPrivateFileSystem", e17, "hy: create no media file failed!", new java.lang.Object[0]);
            }
        }
        return str2 + str;
    }
}
