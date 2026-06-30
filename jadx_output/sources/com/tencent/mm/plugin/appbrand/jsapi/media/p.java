package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes12.dex */
public abstract class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public final void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.List C = C(jSONObject);
        if (C.isEmpty()) {
            lVar.a(i17, u("fail filePath invalid", null));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.media.q(this, lVar, jSONObject, C, i17);
        com.tencent.mm.plugin.appbrand.jsapi.media.w wVar = (com.tencent.mm.plugin.appbrand.jsapi.media.w) i95.n0.c(com.tencent.mm.plugin.appbrand.jsapi.media.w.class);
        if (wVar == null || android.os.Build.VERSION.SDK_INT >= 29) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", "NULL permissionInterface with appId:%s, run directly", lVar.getAppId());
            qVar.run();
        } else {
            ((com.tencent.mm.plugin.appbrand.app.d8) wVar).wi(lVar.getContext(), lVar, qVar, new com.tencent.mm.plugin.appbrand.jsapi.media.r(this, lVar, i17));
        }
    }

    public java.util.List C(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
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
    public final void G(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.media.v vVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str2) {
        java.io.OutputStream outputStream;
        ?? r17 = 0;
        r1 = null;
        java.io.OutputStream outputStream2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            vVar.a(str, "fail file path invalid", false, null);
            return;
        }
        java.io.InputStream readStream = lVar.getFileSystem().readStream(str);
        try {
            try {
                if (readStream == null) {
                    vVar.a(str, "fail file not exists", false, null);
                } else {
                    java.lang.String c17 = s46.c.c(str);
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = q75.g.b(c17);
                    }
                    if (!D(str2)) {
                        vVar.a(str, "fail invalid file type", false, null);
                        com.tencent.mm.sdk.platformtools.t8.v1(readStream);
                        return;
                    }
                    java.lang.String E = E(c17, str2);
                    if (android.os.Build.VERSION.SDK_INT < 29 || com.tencent.mm.sdk.platformtools.x.f193064a) {
                        boolean I = I(E, readStream);
                        if (I) {
                            q75.c.f(E, lVar.getContext());
                        }
                        vVar.a(str, I ? "" : "fail", I, E);
                    } else {
                        com.tencent.mm.sdk.platformtools.a7[] a7VarArr = {null};
                        if (u46.l.a(str2, "video")) {
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            com.tencent.mm.sdk.platformtools.b7.d(context, E, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new com.tencent.mm.sdk.platformtools.t6(new com.tencent.mm.plugin.appbrand.jsapi.media.s(this, a7VarArr), E, context));
                        } else if (u46.l.a(str2, "image")) {
                            com.tencent.mm.sdk.platformtools.u6.b(com.tencent.mm.sdk.platformtools.x2.f193071a, E, new com.tencent.mm.plugin.appbrand.jsapi.media.t(this, a7VarArr));
                        }
                        com.tencent.mm.sdk.platformtools.a7 a7Var = a7VarArr[0];
                        outputStream = a7Var != null ? a7Var.b() : null;
                        try {
                            if (outputStream == null) {
                                throw new java.io.IOException("Open OutputStream with MediaStore fail!");
                            }
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = readStream.read(bArr);
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
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", e, "", new java.lang.Object[0]);
                            com.tencent.mm.sdk.platformtools.t8.v1(readStream);
                            com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                            return;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            vVar.a(str, "fail io exception ", false, null);
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", e, "", new java.lang.Object[0]);
                            com.tencent.mm.sdk.platformtools.t8.v1(readStream);
                            com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                            return;
                        }
                    }
                }
                com.tencent.mm.sdk.platformtools.t8.v1(readStream);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                r17 = str2;
                com.tencent.mm.sdk.platformtools.t8.v1(readStream);
                com.tencent.mm.sdk.platformtools.t8.v1(r17);
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
            com.tencent.mm.sdk.platformtools.t8.v1(readStream);
            com.tencent.mm.sdk.platformtools.t8.v1(r17);
            throw th;
        }
    }

    public abstract void H(java.lang.String str);

    public final boolean I(java.lang.String str, java.io.InputStream inputStream) {
        java.io.OutputStream outputStream = null;
        try {
            try {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                r6Var.s().J();
                outputStream = com.tencent.mm.vfs.w6.H(r6Var);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read == -1) {
                        outputStream.flush();
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", "writeFile exp %s", e17);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                return false;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
            throw th6;
        }
    }
}
