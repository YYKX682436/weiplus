package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class x3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f221307e = "";

    public static boolean f(java.lang.String str, java.io.InputStream inputStream) {
        java.io.OutputStream outputStream = null;
        try {
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
                java.util.Objects.requireNonNull(s17);
                s17.J();
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveImageToPhotosAlbum", "writeFile exp %s", e17);
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

    public static java.lang.String g(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str2 : "_";
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir() + "/gamecenter/tmp/" + str + "/";
    }

    public static void h(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str + str2, true);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveImageToPhotosAlbum", "save temp file failed");
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c4(bitmap, str, q5Var, context, str2));
    }

    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p6.f34496x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSaveImageToPhotosAlbum", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        java.lang.String optString2 = jSONObject.optString("imgUrl");
        java.lang.String optString3 = jSONObject.optString("base64ImgStr");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tailInfo");
        f221307e = g("bundle", null);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.y3 y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.y3(this, bVar, optJSONObject);
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488143d, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a4(this, optString3, bVar, y3Var, optString2, optString), new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.x3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5.this.a("saveToPhotosAlbum fail:system permission denied", null);
            }
        });
    }
}
