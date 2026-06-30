package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class e3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17;
        boolean z18;
        com.tencent.mm.vfs.r6 allocTempFile;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var;
        java.lang.String str3;
        org.json.JSONArray jSONArray;
        java.util.HashMap hashMap;
        java.lang.String str4;
        ik1.b0 b0Var;
        int i17;
        java.lang.String str5;
        java.lang.String str6;
        ik1.b0 b0Var2;
        com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var2;
        java.util.HashMap hashMap2;
        com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var3;
        java.lang.String str7;
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (absoluteFile == null || !absoluteFile.m()) {
            if (lVar.getFileSystem().access(str) != j1Var || (allocTempFile = lVar.getFileSystem().allocTempFile(java.net.URLEncoder.encode(str))) == null) {
                z17 = false;
            } else {
                ik1.b0 b0Var3 = new ik1.b0();
                lVar.getFileSystem().readFile(str, b0Var3);
                try {
                    java.nio.channels.Channels.newChannel(com.tencent.mm.vfs.w6.H(allocTempFile)).write((java.nio.ByteBuffer) b0Var3.f291824a);
                    absoluteFile = new com.tencent.mm.vfs.r6(allocTempFile.o());
                    z17 = true;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.FileSystem.UnitReadZipEntry", "copy ByteBuffer failed e = %s", e17);
                    z17 = false;
                    absoluteFile = null;
                }
            }
            if (absoluteFile == null) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file \"%s\"", str);
            }
            z18 = z17;
        } else {
            if (absoluteFile.y() || com.tencent.mm.plugin.appbrand.appstorage.l1.a(absoluteFile)) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
            }
            z18 = false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var4 = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        ik1.b0 b0Var5 = new ik1.b0();
        b0Var5.f291824a = b0Var4;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        ik1.b0 b0Var6 = new ik1.b0();
        b0Var6.f291824a = hashMap3;
        java.lang.String str8 = "";
        java.lang.String str9 = "fail invalid encoding";
        java.lang.String str10 = "encoding";
        if (!com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(jSONObject.optString("entries", ""))) {
            java.lang.String str11 = "entries";
            java.lang.String str12 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry";
            java.util.HashMap hashMap4 = hashMap3;
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var7 = b0Var4;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(str11);
            if (optJSONArray == null) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail invalid input: entries format wrong", new java.lang.Object[0]);
            }
            ik1.b0 b0Var8 = b0Var6;
            int i18 = 0;
            while (i18 < optJSONArray.length()) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                if (optJSONObject != null) {
                    org.json.JSONArray jSONArray2 = optJSONArray;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH))) {
                        java.lang.String optString = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                        java.lang.String optString2 = optJSONObject.optString(str10, str8);
                        int i19 = i18;
                        java.lang.String str13 = str12;
                        long optLong = optJSONObject.optLong("position", 0L);
                        java.lang.String str14 = str11;
                        com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var9 = b0Var7;
                        long optLong2 = optJSONObject.optLong("length", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                        java.lang.String str15 = str10;
                        try {
                            try {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                    str2 = str8;
                                    a0Var = null;
                                } else {
                                    str2 = str8;
                                    com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var4 = (com.tencent.mm.plugin.appbrand.jsapi.file.a0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.file.z.f81145a).get(optString2.toLowerCase());
                                    if (a0Var4 == null) {
                                        java.util.HashMap hashMap5 = new java.util.HashMap();
                                        hashMap5.put("errMsg", str9);
                                        hashMap4.put("file:" + optString, hashMap5);
                                        str3 = str;
                                        jSONArray = jSONArray2;
                                        hashMap = hashMap4;
                                        str4 = str9;
                                        b0Var = b0Var8;
                                        i17 = i19;
                                        str5 = str14;
                                        str6 = str13;
                                        hashMap4 = hashMap;
                                        b0Var8 = b0Var;
                                        b0Var7 = b0Var9;
                                        str10 = str15;
                                        str8 = str2;
                                        str9 = str4;
                                        str12 = str6;
                                        str11 = str5;
                                        i18 = i17 + 1;
                                        optJSONArray = jSONArray;
                                    } else {
                                        a0Var = a0Var4;
                                    }
                                }
                                com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry = lVar.getFileSystem().readZipEntry(str, b0Var2, optString, optLong, optLong2);
                                java.lang.String o17 = absoluteFile.o();
                                if (z18) {
                                    com.tencent.mm.vfs.w6.h(o17);
                                }
                                if (readZipEntry == j1Var && b0Var2.f291824a != null && ((java.util.Map) b0Var2.f291824a).size() > 0) {
                                    e(b0Var2, a0Var2, b0Var5, b0Var);
                                    str3 = str;
                                    hashMap = hashMap2;
                                } else if (b0Var2.f291824a == null || ((java.util.Map) b0Var2.f291824a).size() != 0) {
                                    hashMap = hashMap2;
                                    int ordinal = readZipEntry.ordinal();
                                    if (ordinal == 11) {
                                        str3 = str;
                                        java.util.HashMap hashMap6 = new java.util.HashMap();
                                        hashMap6.put("errMsg", "fail the value of position is out of range");
                                        hashMap.put("file:" + optString, hashMap6);
                                    } else {
                                        if (ordinal != 12) {
                                            return d(readZipEntry, str);
                                        }
                                        str3 = str;
                                        java.util.HashMap hashMap7 = new java.util.HashMap();
                                        hashMap7.put("errMsg", "fail the value of length is out of range");
                                        hashMap.put("file:" + optString, hashMap7);
                                    }
                                } else {
                                    java.util.HashMap hashMap8 = new java.util.HashMap();
                                    hashMap8.put("errMsg", "fail no such file");
                                    hashMap = hashMap2;
                                    hashMap.put("file:" + optString, hashMap8);
                                    str3 = str;
                                }
                                hashMap4 = hashMap;
                                b0Var8 = b0Var;
                                b0Var7 = b0Var9;
                                str10 = str15;
                                str8 = str2;
                                str9 = str4;
                                str12 = str6;
                                str11 = str5;
                                i18 = i17 + 1;
                                optJSONArray = jSONArray;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                com.tencent.mars.xlog.Log.printErrStackTrace(str6, e, "read zip stream, single file mode", new java.lang.Object[0]);
                                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail read ZipEntry", new java.lang.Object[0]);
                            }
                            jSONArray = jSONArray2;
                            i17 = i19;
                            str4 = str9;
                            a0Var2 = a0Var;
                            b0Var = b0Var8;
                            str6 = str13;
                            hashMap2 = hashMap4;
                            str5 = str14;
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            str6 = str13;
                        }
                        b0Var2 = new ik1.b0();
                    }
                }
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryinvalid input data", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var10 = b0Var7;
            ((java.util.HashMap) b0Var10.f81319a).put(str11, hashMap4);
            return b0Var10;
        }
        java.lang.String optString3 = jSONObject.optString("encoding");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FileSystem.UnitReadZipEntry", "call, all files, path %s, encoding %s", str, optString3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            a0Var3 = null;
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var5 = (com.tencent.mm.plugin.appbrand.jsapi.file.a0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.file.z.f81145a).get(optString3.toLowerCase());
            if (a0Var5 == null) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail invalid encoding", new java.lang.Object[0]);
            }
            a0Var3 = a0Var5;
        }
        ik1.b0 b0Var11 = new ik1.b0();
        try {
            str7 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry";
            try {
                com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry2 = lVar.getFileSystem().readZipEntry(str, b0Var11, "", 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                java.lang.String o18 = absoluteFile.o();
                if (z18) {
                    com.tencent.mm.vfs.w6.h(o18);
                }
                if (readZipEntry2 != j1Var || b0Var11.f291824a == null) {
                    return d(readZipEntry2, str);
                }
                e(b0Var11, a0Var3, b0Var5, b0Var6);
                ((java.util.HashMap) b0Var4.f81319a).put("entries", hashMap3);
                return b0Var4;
            } catch (java.lang.Exception e27) {
                e = e27;
                com.tencent.mars.xlog.Log.printErrStackTrace(str7, e, "read zip stream, all files mode", new java.lang.Object[0]);
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail read zip data", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            str7 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry";
        }
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.file.b0 d(com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var, java.lang.String str) {
        int ordinal = j1Var.ordinal();
        if (ordinal == 2) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail sdcard not mounted", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory, open \"%s\"", str);
        }
        if (ordinal == 4) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + j1Var.name(), new java.lang.Object[0]);
    }

    public final void e(ik1.b0 b0Var, com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var, ik1.b0 b0Var2, ik1.b0 b0Var3) {
        if (b0Var.f291824a == null || b0Var2.f291824a == null || b0Var3.f291824a == null) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.Map) b0Var.f291824a).entrySet()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (a0Var == null) {
                ((java.util.HashMap) ((com.tencent.mm.plugin.appbrand.jsapi.file.b0) b0Var2.f291824a).f81319a).put("file:" + ((java.lang.String) entry.getKey()), entry.getValue());
                hashMap.put("errMsg", "ok");
            } else {
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, a0Var.a((java.nio.ByteBuffer) entry.getValue()));
                hashMap.put("errMsg", "ok");
            }
            ((java.util.Map) b0Var3.f291824a).put("file:" + ((java.lang.String) entry.getKey()), hashMap);
        }
    }
}
