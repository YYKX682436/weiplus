package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.LibraryLoader */
/* loaded from: classes12.dex */
class C1458xb803b88e {

    /* renamed from: DELIMITER */
    static final java.lang.String f4724x972975e7 = java.lang.System.getProperty("line.separator");

    /* renamed from: SEPARATOR */
    static final java.lang.String f4725xd60f2c5 = java.lang.System.getProperty("file.separator");

    /* renamed from: SWT_LIB_DIR */
    static final java.lang.String f4726xb2d91cc4 = ".j2v8";

    /* renamed from: _hellAccFlag_ */
    private byte f4727x7f11beae;

    /* renamed from: chmod */
    public static void m15827x5a4047d(java.lang.String str, java.lang.String str2) {
        if (m15839x2de0e9f9()) {
            return;
        }
        try {
            java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"chmod", str, str2}).waitFor();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: computeLibraryFullName */
    private static java.lang.String m15828x1fefaa5e() {
        return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + m15829xca0e7103() + "." + m15833xf9822489();
    }

    /* renamed from: computeLibraryShortName */
    private static java.lang.String m15829xca0e7103() {
        return "j2v8_" + m15832x5db1bba() + "_" + m15831xc26d533d();
    }

    /* renamed from: extract */
    public static boolean m15830xb232dc81(java.lang.String str, java.lang.String str2, java.lang.StringBuffer stringBuffer) {
        java.io.InputStream inputStream;
        boolean z17;
        java.io.File file = new java.io.File(str);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            inputStream = com.p159x477cd522.p160x333422.C1458xb803b88e.class.getResourceAsStream("/" + str2);
            if (inputStream != null) {
                z17 = true;
                try {
                    byte[] bArr = new byte[4096];
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(str);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (java.lang.Throwable unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.io.IOException unused2) {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                            }
                            if (z17 && file.exists()) {
                                file.delete();
                            }
                            return false;
                        }
                    }
                    fileOutputStream2.close();
                    inputStream.close();
                    m15827x5a4047d("755", str);
                    if (m15840x32c4e6(str, stringBuffer)) {
                        return true;
                    }
                } catch (java.lang.Throwable unused4) {
                }
            }
        } catch (java.lang.Throwable unused5) {
            inputStream = null;
            z17 = false;
        }
        return false;
    }

    /* renamed from: getArchSuffix */
    public static java.lang.String m15831xc26d533d() {
        java.lang.String property = java.lang.System.getProperty("os.arch");
        return property.equals("i686") ? "x86" : property.equals("amd64") ? "x86_64" : (property.equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4738xac728f3) || property.equals("aarch64")) ? "armv7l" : property;
    }

    /* renamed from: getOS */
    public static java.lang.String m15832x5db1bba() {
        if (m15839x2de0e9f9()) {
            return "win32";
        }
        if (m15837x5fd17c5()) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4737x8718c765;
        }
        if (m15836x7b0bfdea() && !m15835xaa197de5()) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4736x45158d4;
        }
        if (m15835xaa197de5()) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
        }
        throw new java.lang.UnsatisfiedLinkError("Unsupported platform: " + m15834x28fa8d85());
    }

    /* renamed from: getOSFileExtension */
    public static java.lang.String m15833xf9822489() {
        if (m15839x2de0e9f9()) {
            return "dll";
        }
        if (m15837x5fd17c5()) {
            return "dylib";
        }
        if (m15836x7b0bfdea() || m15838x460c750c()) {
            return "so";
        }
        throw new java.lang.UnsatisfiedLinkError("Unsupported platform: " + m15834x28fa8d85());
    }

    /* renamed from: getOsName */
    public static java.lang.String m15834x28fa8d85() {
        return java.lang.System.getProperty("os.name") + java.lang.System.getProperty("java.specification.vendor");
    }

    /* renamed from: isAndroid */
    public static boolean m15835xaa197de5() {
        return m15834x28fa8d85().contains("Android");
    }

    /* renamed from: isLinux */
    public static boolean m15836x7b0bfdea() {
        return m15834x28fa8d85().startsWith("Linux");
    }

    /* renamed from: isMac */
    public static boolean m15837x5fd17c5() {
        return m15834x28fa8d85().startsWith("Mac");
    }

    /* renamed from: isNativeClient */
    public static boolean m15838x460c750c() {
        return m15834x28fa8d85().startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4738xac728f3);
    }

    /* renamed from: isWindows */
    public static boolean m15839x2de0e9f9() {
        return m15834x28fa8d85().startsWith("Windows");
    }

    /* renamed from: load */
    public static boolean m15840x32c4e6(java.lang.String str, java.lang.StringBuffer stringBuffer) {
        try {
            if (str.indexOf(f4725xd60f2c5) != -1) {
                com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
                com.p314xaae8f345.cso.C2941xefde02d2.h(str);
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/eclipsesource/mmv8/LibraryLoader", "load", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/eclipsesource/mmv8/LibraryLoader", "load", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        } catch (java.lang.UnsatisfiedLinkError e17) {
            if (stringBuffer.length() == 0) {
                stringBuffer.append(f4724x972975e7);
            }
            stringBuffer.append('\t');
            stringBuffer.append(e17.getMessage());
            stringBuffer.append(f4724x972975e7);
            return false;
        }
    }

    /* renamed from: loadLibrary */
    public static void m15841xeb57c8f5(java.lang.String str) {
        if (m15835xaa197de5()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("mmj2v8");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/eclipsesource/mmv8/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/eclipsesource/mmv8/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String m15829xca0e7103 = m15829xca0e7103();
        java.lang.String m15828x1fefaa5e = m15828x1fefaa5e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.System.getProperty("user.dir"));
        java.lang.String str2 = f4725xd60f2c5;
        sb6.append(str2);
        sb6.append("jni");
        sb6.append(str2);
        sb6.append(m15828x1fefaa5e());
        java.lang.String sb7 = sb6.toString();
        if (m15840x32c4e6(m15828x1fefaa5e, stringBuffer) || m15840x32c4e6(m15829xca0e7103, stringBuffer)) {
            return;
        }
        if (new java.io.File(sb7).exists() && m15840x32c4e6(sb7, stringBuffer)) {
            return;
        }
        if (str == null) {
            str = java.lang.System.getProperty("java.io.tmpdir");
        }
        if (m15830xb232dc81(str + str2 + m15828x1fefaa5e, m15828x1fefaa5e, stringBuffer)) {
            return;
        }
        throw new java.lang.UnsatisfiedLinkError("Could not load J2V8 library. Reasons: " + stringBuffer.toString());
    }
}
