package x34;

/* loaded from: classes13.dex */
public abstract class a {
    public static java.lang.String a(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findVersionFromData", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        java.lang.String str = "";
        if (bArr == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findVersionFromData", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            return "";
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i17 >= bArr.length) {
                break;
            }
            if (i18 > 50000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.ChromeInfoUtils", "findVersionFromData strCount > 20000");
                break;
            }
            if (bArr[i17] == 0) {
                int i27 = i17 - i19;
                if (i27 < 8 || i27 > 20) {
                    i19 = i17 + 1;
                } else {
                    try {
                        byte[] bArr2 = new byte[i27];
                        java.lang.System.arraycopy(bArr, i19, bArr2, 0, i27);
                        i19 = i17 + 1;
                        int i28 = i27 - 1;
                        if ((bArr2[0] & 255) == i28) {
                            byte[] bArr3 = new byte[i28];
                            java.lang.System.arraycopy(bArr2, 1, bArr3, 0, i28);
                            bArr2 = bArr3;
                        }
                        if (y34.b.a(bArr2)) {
                            str = new java.lang.String(bArr2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                            break;
                        }
                        i18++;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.ChromeInfoUtils", "findVersionFromData got Exception:" + th6.toString());
                    }
                }
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findVersionFromData", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (r5 < 0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0255  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x34.a.b(android.content.Context, boolean):java.lang.String");
    }

    public static java.lang.String c() {
        java.lang.String str;
        java.lang.Object[] objArr;
        java.lang.Object obj;
        java.lang.reflect.Method declaredMethod;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWebViewPackageName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        try {
            objArr = new java.lang.Object[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeStaticMethod", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ReflectUtils");
            obj = null;
            try {
                declaredMethod = java.lang.Class.forName("android.webkit.WebViewFactory").getDeclaredMethod("getWebViewContextAndSetProvider", null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.ReflectUtils", "invokeStaticMethod exp=" + e17.toString());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.ChromeInfoUtils", "getWebViewPackageName4More failed!" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            str = "com.google.android.webview";
        }
        if (declaredMethod != null) {
            declaredMethod.setAccessible(true);
            obj = declaredMethod.invoke(null, objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeStaticMethod", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ReflectUtils");
            str = ((android.content.Context) obj).getApplicationInfo().packageName;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewPackageName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeStaticMethod", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ReflectUtils");
        str = ((android.content.Context) obj).getApplicationInfo().packageName;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewPackageName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        return str;
    }

    public static java.nio.ByteBuffer d(java.lang.String str) {
        java.util.zip.ZipFile zipFile;
        java.io.InputStream inputStream;
        int available;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readDexFile", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        java.nio.ByteBuffer byteBuffer = null;
        try {
            zipFile = new java.util.zip.ZipFile(str);
            java.util.zip.ZipEntry entry = zipFile.getEntry(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29);
            entry.toString();
            inputStream = zipFile.getInputStream(entry);
            available = inputStream.available();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.ChromeInfoUtils", "readDexFile got Throwable:" + th6.toString());
        }
        if (available > 10485760) {
            inputStream.close();
            zipFile.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readDexFile", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            return null;
        }
        byteBuffer = java.nio.ByteBuffer.allocate(available);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteBuffer.put(bArr, 0, read);
        }
        inputStream.close();
        zipFile.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readDexFile", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0200 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x34.a.e(java.lang.String):byte[]");
    }
}
