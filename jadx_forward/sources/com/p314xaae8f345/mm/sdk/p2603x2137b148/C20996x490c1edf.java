package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* renamed from: com.tencent.mm.sdk.platformtools.MMNativeJpeg */
/* loaded from: classes12.dex */
public class C20996x490c1edf {

    /* renamed from: FAKE_PARTIAL_PROGRESSIVE_QUALITY */
    public static final int f39183x31894a43 = 25;
    public static final java.lang.String TAG = "MMJPEG.JAVA";

    /* renamed from: _hellAccFlag_ */
    private byte f39184x7f11beae;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r3 == null) goto L30;
     */
    /* renamed from: Convert2Baseline */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m77702x97ddd864(java.lang.String r7, int r8) {
        /*
            boolean r0 = m77709xef66a801(r7)
            r1 = 1
            java.lang.String r2 = "MMJPEG.JAVA"
            if (r0 != 0) goto L13
            java.lang.String r8 = "c2b: not progressive file.%s"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r8, r7)
            return r1
        L13:
            r0 = 0
            r3 = 0
            android.graphics.Bitmap r4 = com.p314xaae8f345.mm.p786x600aa8b.e.c(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            if (r4 != 0) goto L24
            java.lang.String r4 = "c2b:use mmjpeg to decode."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            android.graphics.Bitmap r4 = m77707x6317a40f(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
        L24:
            if (r4 == 0) goto L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            r5.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            r5.append(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            java.lang.String r6 = ".base"
            r5.append(r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            java.io.OutputStream r3 = com.p314xaae8f345.mm.vfs.w6.K(r5, r0)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            boolean r8 = r4.compress(r6, r8, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            if (r8 == 0) goto L5a
            java.lang.String r8 = "c2b: convert baseline %s ok."
            java.lang.Object[] r4 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.a(r5, r7, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.lang.Exception -> L55
        L55:
            return r7
        L56:
            r7 = move-exception
            goto L79
        L58:
            r7 = move-exception
            goto L68
        L5a:
            if (r3 == 0) goto L78
        L5c:
            r3.close()     // Catch: java.lang.Exception -> L78
            goto L78
        L60:
            java.lang.String r7 = "c2b: oom"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L78
            goto L5c
        L68:
            java.lang.String r8 = "c2b:exception:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = m77708x6cf4e7b4(r7)     // Catch: java.lang.Throwable -> L56
            r1[r0] = r7     // Catch: java.lang.Throwable -> L56
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r8, r1)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L78
            goto L5c
        L78:
            return r0
        L79:
            if (r3 == 0) goto L7e
            r3.close()     // Catch: java.lang.Exception -> L7e
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77702x97ddd864(java.lang.String, int):boolean");
    }

    /* renamed from: Destroy */
    public static void m77703xc00c37da() {
    }

    /* renamed from: IsJpegFile */
    public static boolean m77704x21a6596e(java.lang.String str) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77772xaeab486e(m77711xcb86fa7e(str)) != null) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "IsJpegFile : can't query jpeg parames.");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "IsJpegFile exception:%s", m77708x6cf4e7b4(e17));
            return false;
        }
    }

    /* renamed from: checkAndroidVersion */
    private static boolean m77705xee307691() {
        return true;
    }

    /* renamed from: convertToProgressive */
    public static boolean m77706x13871d(java.lang.String str, int i17) {
        if (!m77705xee307691()) {
            return false;
        }
        java.lang.String m77711xcb86fa7e = m77711xcb86fa7e(str);
        try {
            java.lang.String str2 = m77711xcb86fa7e + ".prog.dat";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "convert %s to %s use progressive.quality:%d", m77711xcb86fa7e, str2, java.lang.Integer.valueOf(i17));
            int m77769x13871d = com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77769x13871d(m77711xcb86fa7e, str2);
            if (m77769x13871d != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "convert failed. error:%d", java.lang.Integer.valueOf(m77769x13871d));
                return false;
            }
            boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(str2, m77711xcb86fa7e, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "convert ret:%b", java.lang.Boolean.valueOf(x17));
            return x17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "convertToProgressive exception:%s", m77708x6cf4e7b4(e17));
            return false;
        }
    }

    /* renamed from: decodeAsBitmap */
    public static android.graphics.Bitmap m77707x6317a40f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "decodeAsBitmap:%s", str);
        java.lang.String m77711xcb86fa7e = m77711xcb86fa7e(str);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C20993x4db3b42e m77772xaeab486e = com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77772xaeab486e(m77711xcb86fa7e);
            if (m77772xaeab486e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "can't query jpeg parames.");
                return null;
            }
            int i17 = m77772xaeab486e.f39181x4fb3da6;
            int i18 = m77772xaeab486e.f39180x809d7d47;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/MMNativeJpeg", "decodeAsBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/sdk/platformtools/MMNativeJpeg", "decodeAsBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77770x45350b98(m77711xcb86fa7e, createBitmap)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "decode bitmap successed.");
                return createBitmap;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "can't decode to bmp.");
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "decodeAsBitmap exception:%s", m77708x6cf4e7b4(e17));
            return null;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "decodeAsBitmap OOM:%s", m77711xcb86fa7e);
            return null;
        }
    }

    /* renamed from: exception2String */
    private static java.lang.String m77708x6cf4e7b4(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: isProgressive */
    public static boolean m77709xef66a801(java.lang.String str) {
        if (!m77705xee307691() || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return false;
        }
        java.lang.String m77711xcb86fa7e = m77711xcb86fa7e(str);
        try {
            int m77771xc02291d = com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77771xc02291d(m77711xcb86fa7e);
            if (1 == m77771xc02291d || m77771xc02291d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "file:%s progressive:%d", m77711xcb86fa7e, java.lang.Integer.valueOf(m77771xc02291d));
                return m77771xc02291d == 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "check failed. error:%d", java.lang.Integer.valueOf(m77771xc02291d));
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "isProgressive exception:%s", m77708x6cf4e7b4(e17));
            return false;
        }
    }

    /* renamed from: queryQuality */
    public static int m77710x7cda4f17(java.lang.String str) {
        if (!m77705xee307691() || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return 0;
        }
        java.lang.String m77711xcb86fa7e = m77711xcb86fa7e(str);
        try {
            int m77773x7cda4f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77773x7cda4f17(m77711xcb86fa7e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "after query quality:%d", java.lang.Integer.valueOf(m77773x7cda4f17));
            if (m77773x7cda4f17 < 10000 && m77773x7cda4f17 >= 24) {
                return m77773x7cda4f17;
            }
            if (1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.C21002xc0321e08.m77771xc02291d(m77711xcb86fa7e)) {
                return 25;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "invalid jpeg file or too small quality.");
            return 0;
        } catch (java.lang.IncompatibleClassChangeError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Crash", e17, "May cause dvmFindCatchBlock crash!", new java.lang.Object[0]);
            throw ((java.lang.IncompatibleClassChangeError) new java.lang.IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(e17));
        } catch (java.lang.Error e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "queryQuality error. java.lang.UnsatisfiedLinkError: queryQuality, %s", e18.toString());
            return 0;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "queryQuality failed. exception:%s", m77708x6cf4e7b4(e19));
            return 0;
        }
    }

    /* renamed from: toRealPath */
    private static java.lang.String m77711xcb86fa7e(java.lang.String str) {
        try {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
            if (i17 == null) {
                return str;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "From %s to real path %s", str, i17);
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "to real path", new java.lang.Object[0]);
            return str;
        }
    }
}
