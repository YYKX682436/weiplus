package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class e3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var;
        java.lang.String str3;
        org.json.JSONArray jSONArray;
        java.util.HashMap hashMap;
        java.lang.String str4;
        ik1.b0 b0Var;
        int i17;
        java.lang.String str5;
        java.lang.String str6;
        ik1.b0 b0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var2;
        java.util.HashMap hashMap2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var3;
        java.lang.String str7;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
            if (lVar.mo50354x59eafec1().mo49300xab27b564(str) != j1Var || (mo49614x6665a5c5 = lVar.mo50354x59eafec1().mo49614x6665a5c5(java.net.URLEncoder.encode(str))) == null) {
                z17 = false;
            } else {
                ik1.b0 b0Var3 = new ik1.b0();
                lVar.mo50354x59eafec1().mo49307xcc440832(str, b0Var3);
                try {
                    java.nio.channels.Channels.newChannel(com.p314xaae8f345.mm.vfs.w6.H(mo49614x6665a5c5)).write((java.nio.ByteBuffer) b0Var3.f373357a);
                    mo49620x1d537609 = new com.p314xaae8f345.mm.vfs.r6(mo49614x6665a5c5.o());
                    z17 = true;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.FileSystem.UnitReadZipEntry", "copy ByteBuffer failed e = %s", e17);
                    z17 = false;
                    mo49620x1d537609 = null;
                }
            }
            if (mo49620x1d537609 == null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file \"%s\"", str);
            }
            z18 = z17;
        } else {
            if (mo49620x1d537609.y() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(mo49620x1d537609)) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail permission denied, open \"%s\"", str);
            }
            z18 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("ok", new java.lang.Object[0]);
        ik1.b0 b0Var5 = new ik1.b0();
        b0Var5.f373357a = b0Var4;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        ik1.b0 b0Var6 = new ik1.b0();
        b0Var6.f373357a = hashMap3;
        java.lang.String str8 = "";
        java.lang.String str9 = "fail invalid encoding";
        java.lang.String str10 = "encoding";
        if (!com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(jSONObject.optString("entries", ""))) {
            java.lang.String str11 = "entries";
            java.lang.String str12 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry";
            java.util.HashMap hashMap4 = hashMap3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var7 = b0Var4;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(str11);
            if (optJSONArray == null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail invalid input: entries format wrong", new java.lang.Object[0]);
            }
            ik1.b0 b0Var8 = b0Var6;
            int i18 = 0;
            while (i18 < optJSONArray.length()) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                if (optJSONObject != null) {
                    org.json.JSONArray jSONArray2 = optJSONArray;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714))) {
                        java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                        java.lang.String optString2 = optJSONObject.optString(str10, str8);
                        int i19 = i18;
                        java.lang.String str13 = str12;
                        long optLong = optJSONObject.optLong("position", 0L);
                        java.lang.String str14 = str11;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var9 = b0Var7;
                        long optLong2 = optJSONObject.optLong("length", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                        java.lang.String str15 = str10;
                        try {
                            try {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                                    str2 = str8;
                                    a0Var = null;
                                } else {
                                    str2 = str8;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.z.f162678a).get(optString2.toLowerCase());
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
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49308xa09c5587 = lVar.mo50354x59eafec1().mo49308xa09c5587(str, b0Var2, optString, optLong, optLong2);
                                java.lang.String o17 = mo49620x1d537609.o();
                                if (z18) {
                                    com.p314xaae8f345.mm.vfs.w6.h(o17);
                                }
                                if (mo49308xa09c5587 == j1Var && b0Var2.f373357a != null && ((java.util.Map) b0Var2.f373357a).size() > 0) {
                                    e(b0Var2, a0Var2, b0Var5, b0Var);
                                    str3 = str;
                                    hashMap = hashMap2;
                                } else if (b0Var2.f373357a == null || ((java.util.Map) b0Var2.f373357a).size() != 0) {
                                    hashMap = hashMap2;
                                    int ordinal = mo49308xa09c5587.ordinal();
                                    if (ordinal == 11) {
                                        str3 = str;
                                        java.util.HashMap hashMap6 = new java.util.HashMap();
                                        hashMap6.put("errMsg", "fail the value of position is out of range");
                                        hashMap.put("file:" + optString, hashMap6);
                                    } else {
                                        if (ordinal != 12) {
                                            return d(mo49308xa09c5587, str);
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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str6, e, "read zip stream, single file mode", new java.lang.Object[0]);
                                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail read ZipEntry", new java.lang.Object[0]);
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
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryinvalid input data", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 b0Var10 = b0Var7;
            ((java.util.HashMap) b0Var10.f162852a).put(str11, hashMap4);
            return b0Var10;
        }
        java.lang.String optString3 = jSONObject.optString("encoding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FileSystem.UnitReadZipEntry", "call, all files, path %s, encoding %s", str, optString3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            a0Var3 = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.z.f162678a).get(optString3.toLowerCase());
            if (a0Var5 == null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail invalid encoding", new java.lang.Object[0]);
            }
            a0Var3 = a0Var5;
        }
        ik1.b0 b0Var11 = new ik1.b0();
        try {
            str7 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry";
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49308xa09c55872 = lVar.mo50354x59eafec1().mo49308xa09c5587(str, b0Var11, "", 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                java.lang.String o18 = mo49620x1d537609.o();
                if (z18) {
                    com.p314xaae8f345.mm.vfs.w6.h(o18);
                }
                if (mo49308xa09c55872 != j1Var || b0Var11.f373357a == null) {
                    return d(mo49308xa09c55872, str);
                }
                e(b0Var11, a0Var3, b0Var5, b0Var6);
                ((java.util.HashMap) b0Var4.f162852a).put("entries", hashMap3);
                return b0Var4;
            } catch (java.lang.Exception e27) {
                e = e27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str7, e, "read zip stream, all files mode", new java.lang.Object[0]);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail read zip data", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            str7 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry";
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var, java.lang.String str) {
        int ordinal = j1Var.ordinal();
        if (ordinal == 2) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail sdcard not mounted", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail no such file or directory, open \"%s\"", str);
        }
        if (ordinal == 4) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail permission denied, open \"%s\"", str);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0("fail " + j1Var.name(), new java.lang.Object[0]);
    }

    public final void e(ik1.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 a0Var, ik1.b0 b0Var2, ik1.b0 b0Var3) {
        if (b0Var.f373357a == null || b0Var2.f373357a == null || b0Var3.f373357a == null) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.Map) b0Var.f373357a).entrySet()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (a0Var == null) {
                ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0) b0Var2.f373357a).f162852a).put("file:" + ((java.lang.String) entry.getKey()), entry.getValue());
                hashMap.put("errMsg", "ok");
            } else {
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, a0Var.a((java.nio.ByteBuffer) entry.getValue()));
                hashMap.put("errMsg", "ok");
            }
            ((java.util.Map) b0Var3.f373357a).put("file:" + ((java.lang.String) entry.getKey()), hashMap);
        }
    }
}
