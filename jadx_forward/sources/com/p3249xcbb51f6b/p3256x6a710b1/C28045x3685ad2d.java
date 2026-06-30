package com.p3249xcbb51f6b.p3256x6a710b1;

/* renamed from: com.tenpay.utils.CommonLibLoader */
/* loaded from: classes12.dex */
public class C28045x3685ad2d {
    /* renamed from: extractAndLoadLibFile */
    private static boolean m122032xef418a65(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str + "/" + str2;
        java.io.File file = new java.io.File(str3, str2);
        try {
            if (file.exists()) {
                if (m122037xbf9b400d(com.p3249xcbb51f6b.p3256x6a710b1.C28045x3685ad2d.class.getResourceAsStream(str4)).equals(m122037xbf9b400d(new java.io.FileInputStream(file)))) {
                    return m122036x7fecca8(str3, str2);
                }
                if (!file.delete()) {
                    throw new java.io.IOException("failed to remove existing native library file: " + file.getAbsolutePath());
                }
            }
            java.io.InputStream resourceAsStream = com.p3249xcbb51f6b.p3256x6a710b1.C28045x3685ad2d.class.getResourceAsStream(str4);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            resourceAsStream.close();
            if (!java.lang.System.getProperty("os.name").contains("Windows")) {
                try {
                    java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"chmod", "755", file.getAbsolutePath()}).waitFor();
                } catch (java.lang.Throwable unused) {
                }
            }
            return m122036x7fecca8(str3, str2);
        } catch (java.io.IOException e17) {
            java.lang.System.err.println(e17.getMessage());
            return false;
        }
    }

    /* renamed from: extractResourceFiles */
    private static boolean m122033xc1b2cc08(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return m122032xef418a65(str, new java.lang.String[]{str2}[0], str3) & true;
    }

    /* renamed from: getNativeLibPath */
    private static java.lang.String m122034x8e2fbc7d() {
        java.lang.String lowerCase = java.lang.System.getProperty("os.name").toLowerCase();
        if (lowerCase.contains("win")) {
            return "/win64";
        }
        if (lowerCase.contains("nux")) {
            return "/linux";
        }
        if (lowerCase.contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb)) {
            return "/mac";
        }
        return null;
    }

    /* renamed from: load */
    public static boolean m122035x32c4e6(java.lang.String str) {
        java.lang.String mapLibraryName = java.lang.System.mapLibraryName(str);
        if (mapLibraryName != null && mapLibraryName.endsWith("dll")) {
            mapLibraryName = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428.concat(mapLibraryName);
        }
        java.lang.String str2 = "/" + com.p3249xcbb51f6b.p3256x6a710b1.C28046x7397cc93.m122040x9e8864ce();
        java.lang.System.out.println("jar lib path=" + str2);
        if (com.p3249xcbb51f6b.p3256x6a710b1.C28045x3685ad2d.class.getResource(str2 + "/" + mapLibraryName) == null) {
            str2 = m122034x8e2fbc7d();
            if (com.p3249xcbb51f6b.p3256x6a710b1.C28045x3685ad2d.class.getResource(str2 + "/" + mapLibraryName) == null) {
                throw new java.lang.Exception("Error loading native library: " + str2 + "/" + mapLibraryName);
            }
        }
        return m122033xc1b2cc08(str2, mapLibraryName, new java.io.File(java.lang.System.getProperty("java.io.tmpdir")).getAbsolutePath());
    }

    /* renamed from: loadNativeLib */
    private static synchronized boolean m122036x7fecca8(java.lang.String str, java.lang.String str2) {
        synchronized (com.p3249xcbb51f6b.p3256x6a710b1.C28045x3685ad2d.class) {
            if (!new java.io.File(str, str2).exists()) {
                return false;
            }
            try {
                com.p314xaae8f345.cso.C2941xefde02d2.g(new java.io.File(str, str2).getAbsolutePath());
                return true;
            } catch (java.lang.UnsatisfiedLinkError e17) {
                java.lang.System.err.println(e17);
                return false;
            }
        }
    }

    /* renamed from: md5sum */
    public static java.lang.String m122037xbf9b400d(java.io.InputStream inputStream) {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
        try {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                do {
                } while (new java.security.DigestInputStream(bufferedInputStream, messageDigest).read() >= 0);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byteArrayOutputStream.write(messageDigest.digest());
                return byteArrayOutputStream.toString();
            } catch (java.security.NoSuchAlgorithmException e17) {
                throw new java.lang.IllegalStateException("MD5 algorithm is not available: " + e17);
            }
        } finally {
            bufferedInputStream.close();
        }
    }
}
