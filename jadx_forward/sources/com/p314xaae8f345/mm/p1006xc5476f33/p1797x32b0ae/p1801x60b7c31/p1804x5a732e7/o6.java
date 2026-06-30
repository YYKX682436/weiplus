package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class o6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225237g = "";

    public static void A(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var, java.lang.String str, org.json.JSONObject jSONObject) {
        o6Var.getClass();
        if (jSONObject == null) {
            return;
        }
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256 = new com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256(jSONObject.optString("url", ""), 1);
        ((m11.z0) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Ri()).getClass();
        c11126xa77ef256.m48138x9616526c();
        m11.z0.f404347a.C(str, c11126xa77ef256);
    }

    public static boolean B(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var, java.lang.String str, java.io.InputStream inputStream) {
        o6Var.getClass();
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "writeFile exp %s", e17);
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

    public boolean C(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Aj(str).equals("video");
    }

    public java.lang.String D(java.lang.String str, boolean z17, boolean z18) {
        if (z17) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            return q75.c.a(str);
        }
        if (!z18) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "mp4";
        }
        return q75.c.b(str);
    }

    public java.lang.String E(java.lang.String str) {
        return str.isEmpty() ? "" : ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(str).f264269e;
    }

    public void F(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, org.json.JSONObject jSONObject, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d6 d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d6(this, str2, str, bitmap, bArr, jSONObject);
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(c(), d6Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e6(this));
    }

    public void G(java.lang.String str, boolean z17, boolean z18) {
        if (z17) {
            dp.a.m125854x26a183b(c(), c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lkm, q75.c.e()), 1).show();
        } else if (z18) {
            dp.a.m125854x26a183b(c(), c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lkn, q75.c.c(str)), 1).show();
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String E;
        java.lang.String str2;
        java.lang.String zj6;
        java.lang.String E2;
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        this.f225237g = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(str, "bundle", null);
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        java.lang.String optString3 = jSONObject.optString("base64ImgStr");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tailInfo");
        java.lang.String optString4 = jSONObject.optString("liveVideoLocalId");
        java.lang.String optString5 = jSONObject.optString("liveVideoFilePath");
        if (android.text.TextUtils.isEmpty(optString) && android.text.TextUtils.isEmpty(optString2) && android.text.TextUtils.isEmpty(optString3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "saveToPhotosAlbum fail, filePath is null");
            this.f224976f.a("saveToPhotosAlbum fail, filePath is null");
            return;
        }
        if (!android.text.TextUtils.isEmpty(optString4) || !android.text.TextUtils.isEmpty(optString5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto coverFilePath=%s, coverLocalId=%s, hasBase64=%b, liveVideoLocalId=%s, liveVideoFilePath=%s", optString, optString2, java.lang.Boolean.valueOf(!android.text.TextUtils.isEmpty(optString3)), optString4, optString5);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d8.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto fail, device not support, internalCode=%d", -2001);
                this.f224976f.a("saveToPhotosAlbum:live photo not supported");
                return;
            } else {
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(c(), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h6(this, str, optString, optString2, optString3, optString4, optString5, optJSONObject), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i6(this));
                return;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            int indexOf = optString3.indexOf(";base64,");
            if (indexOf != -1) {
                optString3 = optString3.substring(indexOf + 8);
            }
            try {
                byte[] decode = android.util.Base64.decode(optString3, 2);
                int length = decode.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(decode);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (decodeByteArray == null) {
                    this.f224976f.a("error base64");
                    return;
                } else {
                    F("", "", decodeByteArray, optJSONObject, decode);
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "error base64, decode failed %s", e17.getMessage());
                this.f224976f.a("error base64");
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(optString)) {
            zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString2);
            E2 = E(zj6);
        } else {
            if (!android.text.TextUtils.isEmpty(optString2) || !((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
                if (com.p314xaae8f345.mm.vfs.w6.j(optString)) {
                    E = E(optString);
                    str2 = optString;
                    F(str2, E, null, optJSONObject, null);
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || !optString.startsWith("http")) {
                        this.f224976f.a("saveToPhotosAlbum fail, file not found");
                        return;
                    }
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a6(this, optString, optString2, optJSONObject, str));
                    return;
                }
            }
            zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString);
            E2 = E(zj6);
        }
        str2 = zj6;
        E = E2;
        F(str2, E, null, optJSONObject, null);
    }
}
