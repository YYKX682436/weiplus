package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareSecurityCheck */
/* loaded from: classes13.dex */
public class C26641x1cdfa429 {
    private static final java.lang.String TAG = "Tinker.SecurityCheck";

    /* renamed from: mPublicKeyMd5 */
    private static java.lang.String f55921xa8f68375;

    /* renamed from: mContext */
    private final android.content.Context f55922xd6cfe882;

    /* renamed from: metaContentMap */
    private final java.util.HashMap<java.lang.String, java.lang.String> f55923xb2dd6a08 = new java.util.HashMap<>();

    /* renamed from: packageProperties */
    private final java.util.HashMap<java.lang.String, java.lang.String> f55924x601c7e19 = new java.util.HashMap<>();

    public C26641x1cdfa429(android.content.Context context) {
        this.f55922xd6cfe882 = context;
        if (f55921xa8f68375 == null) {
            m104716x316510(context);
        }
    }

    /* renamed from: check */
    private boolean m104715x5a3e508(java.io.File file, java.security.cert.Certificate[] certificateArr) {
        if (certificateArr.length <= 0) {
            return false;
        }
        for (int length = certificateArr.length - 1; length >= 0; length--) {
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, file.getAbsolutePath(), e17);
            }
            if (f55921xa8f68375.equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104678xb5885268(certificateArr[length].getEncoded()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: init */
    private void m104716x316510(android.content.Context context) {
        try {
            try {
                java.lang.String m104678xb5885268 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104678xb5885268(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
                f55921xa8f68375 = m104678xb5885268;
                if (m104678xb5885268 != null) {
                } else {
                    throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("get public key md5 is null");
                }
            } catch (java.lang.Exception e17) {
                throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("ShareSecurityCheck init public key fail", e17);
            }
        } finally {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(null);
        }
    }

    /* renamed from: getMetaContentMap */
    public java.util.HashMap<java.lang.String, java.lang.String> m104717xa17536fe() {
        return this.f55923xb2dd6a08;
    }

    /* renamed from: getPackagePropertiesIfPresent */
    public java.util.HashMap<java.lang.String, java.lang.String> m104718x5ae6f2bb() {
        java.lang.String[] split;
        if (!this.f55924x601c7e19.isEmpty()) {
            return this.f55924x601c7e19;
        }
        java.lang.String str = this.f55923xb2dd6a08.get(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55700xe0cd69d);
        if (str == null) {
            return null;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && !str2.startsWith("#") && (split = str2.split("=", 2)) != null && split.length >= 2) {
                this.f55924x601c7e19.put(split[0].trim(), split[1].trim());
            }
        }
        return this.f55924x601c7e19;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0099: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:54:0x0099 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: verifyPatchMetaSignature */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m104719x3bfad524(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Tinker.SecurityCheck"
            boolean r1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(r12)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = 1
            r3 = 0
            java.util.jar.JarFile r4 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            java.util.Enumeration r3 = r4.entries()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
        L15:
            boolean r5 = r3.hasMoreElements()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 == 0) goto L60
            java.lang.Object r5 = r3.nextElement()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.util.jar.JarEntry r5 = (java.util.jar.JarEntry) r5     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 != 0) goto L24
            goto L15
        L24:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.lang.String r7 = "META-INF/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r7 == 0) goto L31
            goto L15
        L31:
            java.lang.String r7 = "meta.txt"
            boolean r7 = r6.endsWith(r7)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r7 != 0) goto L3a
            goto L15
        L3a:
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r11.f55923xb2dd6a08     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.lang.String r8 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104688x48712c78(r4, r5)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            r7.put(r6, r8)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.security.cert.Certificate[] r5 = r5.getCertificates()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 == 0) goto L4f
            boolean r5 = r11.m104715x5a3e508(r12, r5)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 != 0) goto L15
        L4f:
            r4.close()     // Catch: java.io.IOException -> L53
            goto L5f
        L53:
            r1 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r0, r12, r1)
        L5f:
            return r2
        L60:
            r4.close()     // Catch: java.io.IOException -> L64
            goto L70
        L64:
            r2 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r0, r12, r2)
        L70:
            return r1
        L71:
            r3 = move-exception
            goto L79
        L73:
            r1 = move-exception
            goto L9a
        L75:
            r4 = move-exception
            r10 = r4
            r4 = r3
            r3 = r10
        L79:
            com.tencent.tinker.loader.TinkerRuntimeException r5 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "ShareSecurityCheck file %s, size %d verifyPatchMetaSignature fail"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L98
            r7[r2] = r8     // Catch: java.lang.Throwable -> L98
            long r8 = r12.length()     // Catch: java.lang.Throwable -> L98
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L98
            r7[r1] = r2     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L98
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L98
            throw r5     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            r3 = r4
        L9a:
            if (r3 == 0) goto Lac
            r3.close()     // Catch: java.io.IOException -> La0
            goto Lac
        La0:
            r2 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r0, r12, r2)
        Lac:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429.m104719x3bfad524(java.io.File):boolean");
    }
}
