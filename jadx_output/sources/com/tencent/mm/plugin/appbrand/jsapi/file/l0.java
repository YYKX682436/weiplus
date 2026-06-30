package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class l0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 278;
    private static final java.lang.String NAME = "getFileInfo";

    public static java.lang.String C(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        java.lang.String str2 = "";
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            try {
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int read = C.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetFileInfo", "Exception on closing MD5 input stream", e17);
                        }
                    } catch (java.io.IOException unused) {
                        C.close();
                    } catch (java.lang.Throwable th6) {
                        try {
                            C.close();
                        } catch (java.io.IOException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetFileInfo", "Exception on closing MD5 input stream", e18);
                        }
                        throw th6;
                    }
                }
                str2 = D(messageDigest.digest());
                try {
                    C.close();
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetFileInfo", "Exception on closing MD5 input stream", e19);
                }
            } catch (java.io.FileNotFoundException e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetFileInfo", "Exception while getting FileInputStream", e27);
            }
        } catch (java.security.NoSuchAlgorithmException e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetFileInfo", "Exception while getting Digest", e28);
        }
        return str2;
    }

    public static final java.lang.String D(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr.length);
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toLowerCase());
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r9, org.json.JSONObject r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "filePath"
            java.lang.String r1 = ""
            java.lang.String r5 = r10.optString(r0, r1)
            java.lang.String r0 = "digestAlgorithm"
            java.lang.String r1 = "md5"
            java.lang.String r10 = r10.optString(r0, r1)
            java.lang.String r0 = "sha256"
            boolean r2 = r0.equalsIgnoreCase(r10)
            if (r2 == 0) goto L1a
        L18:
            r7 = r0
            goto L24
        L1a:
            java.lang.String r0 = "sha1"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L23
            goto L18
        L23:
            r7 = r1
        L24:
            boolean r10 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r10 == 0) goto L34
            java.lang.String r10 = "fail:invalid data"
            java.lang.String r10 = r8.o(r10)
            r9.a(r11, r10)
            return
        L34:
            java.util.concurrent.ThreadPoolExecutor r10 = com.tencent.mm.plugin.appbrand.jsapi.file.l.f81089h
            com.tencent.mm.plugin.appbrand.jsapi.file.k0 r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.k0
            r2 = r0
            r3 = r8
            r4 = r9
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r10.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.file.l0.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
