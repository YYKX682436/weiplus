package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes12.dex */
public abstract class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public final void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.List C = C(jSONObject);
        if (C.isEmpty()) {
            lVar.a(i17, u("fail filePath invalid", null));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q(this, lVar, jSONObject, C, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w.class);
        if (wVar == null || android.os.Build.VERSION.SDK_INT >= 29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", "NULL permissionInterface with appId:%s, run directly", lVar.mo48798x74292566());
            qVar.run();
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d8) wVar).wi(lVar.mo50352x76847179(), lVar, qVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r(this, lVar, i17));
        }
    }

    public java.util.List C(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            return arrayList;
        }
        arrayList.add(optString);
        return arrayList;
    }

    public abstract boolean D(java.lang.String str);

    public abstract java.lang.String E(java.lang.String str, java.lang.String str2);

    public java.util.List F(org.json.JSONObject jSONObject) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void G(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str2) {
        java.io.OutputStream outputStream;
        ?? r17 = 0;
        r1 = null;
        java.io.OutputStream outputStream2 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            vVar.a(str, "fail file path invalid", false, null);
            return;
        }
        java.io.InputStream mo49627xe22f8cb6 = lVar.mo50354x59eafec1().mo49627xe22f8cb6(str);
        try {
            try {
                if (mo49627xe22f8cb6 == null) {
                    vVar.a(str, "fail file not exists", false, null);
                } else {
                    java.lang.String c17 = s46.c.c(str);
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = q75.g.b(c17);
                    }
                    if (!D(str2)) {
                        vVar.a(str, "fail invalid file type", false, null);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(mo49627xe22f8cb6);
                        return;
                    }
                    java.lang.String E = E(c17, str2);
                    if (android.os.Build.VERSION.SDK_INT < 29 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a) {
                        boolean I = I(E, mo49627xe22f8cb6);
                        if (I) {
                            q75.c.f(E, lVar.mo50352x76847179());
                        }
                        vVar.a(str, I ? "" : "fail", I, E);
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a7[] a7VarArr = {null};
                        if (u46.l.a(str2, "video")) {
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.b7.d(context, E, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new com.p314xaae8f345.mm.sdk.p2603x2137b148.t6(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s(this, a7VarArr), E, context));
                        } else if (u46.l.a(str2, "image")) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u6.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, E, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t(this, a7VarArr));
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var = a7VarArr[0];
                        outputStream = a7Var != null ? a7Var.b() : null;
                        try {
                            if (outputStream == null) {
                                throw new java.io.IOException("Open OutputStream with MediaStore fail!");
                            }
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = mo49627xe22f8cb6.read(bArr);
                                if (-1 == read) {
                                    break;
                                } else {
                                    outputStream.write(bArr, 0, read);
                                }
                            }
                            outputStream.flush();
                            a7VarArr[0].c();
                            vVar.a(str, null, true, E);
                            outputStream2 = outputStream;
                        } catch (java.io.IOException e17) {
                            e = e17;
                            vVar.a(str, "fail io exception ", false, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", e, "", new java.lang.Object[0]);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(mo49627xe22f8cb6);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                            return;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            vVar.a(str, "fail io exception ", false, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", e, "", new java.lang.Object[0]);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(mo49627xe22f8cb6);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                            return;
                        }
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(mo49627xe22f8cb6);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                r17 = str2;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(mo49627xe22f8cb6);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r17);
                throw th;
            }
        } catch (java.io.IOException e19) {
            e = e19;
            outputStream = null;
        } catch (java.lang.Exception e27) {
            e = e27;
            outputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(mo49627xe22f8cb6);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r17);
            throw th;
        }
    }

    public abstract void H(java.lang.String str);

    public final boolean I(java.lang.String str, java.io.InputStream inputStream) {
        java.io.OutputStream outputStream = null;
        try {
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                r6Var.s().J();
                outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read == -1) {
                        outputStream.flush();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", "writeFile exp %s", e17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                return false;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
            throw th6;
        }
    }
}
