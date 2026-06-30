package com.p314xaae8f345.mm.p930xc01b152a.p934x36f002;

/* renamed from: com.tencent.mm.mm7zip.util.FileOps */
/* loaded from: classes12.dex */
public class C11097x30421776 {
    /* renamed from: deleteFile */
    public static void m47814x692721c7(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: exists */
    public static boolean m47815xb325f45c(java.lang.String str) {
        return new java.io.File(str).exists();
    }

    /* renamed from: getParentPath */
    public static java.lang.String m47816xdfa933e5(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(java.io.File.separatorChar);
        if (lastIndexOf <= 0) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: makeSureExist */
    public static void m47817xdfa79994(java.lang.String str, boolean z17) {
        java.io.File file = new java.io.File(str);
        if (z17) {
            file.mkdirs();
            return;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* renamed from: unzipFolder */
    public static int m47818xea889076(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipInputStream zipInputStream;
        java.util.zip.ZipInputStream zipInputStream2 = null;
        try {
            zipInputStream = new java.util.zip.ZipInputStream(new java.io.FileInputStream(str));
        } catch (java.io.FileNotFoundException unused) {
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            byte[] bArr = new byte[4096];
            while (true) {
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    java.lang.String name = nextEntry.getName();
                    if (!name.contains("../") && !name.contains("..\\")) {
                        if (nextEntry.isDirectory()) {
                            java.lang.String substring = name.substring(0, name.length() - 1);
                            if (hashSet.add(substring)) {
                                new java.io.File(str2 + java.io.File.separator + substring).mkdirs();
                            }
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str2);
                            java.lang.String str3 = java.io.File.separator;
                            sb6.append(str3);
                            sb6.append(name);
                            java.io.File file = new java.io.File(sb6.toString());
                            java.lang.String m47816xdfa933e5 = m47816xdfa933e5(name);
                            if (m47816xdfa933e5 != null && hashSet.add(m47816xdfa933e5)) {
                                new java.io.File(str2 + str3 + m47816xdfa933e5).mkdirs();
                            }
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                        }
                    }
                } else {
                    try {
                        break;
                    } catch (java.io.IOException unused3) {
                    }
                }
            }
            zipInputStream.close();
            return 0;
        } catch (java.io.FileNotFoundException unused4) {
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                } catch (java.io.IOException unused5) {
                }
            }
            return -1;
        } catch (java.io.IOException unused6) {
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 == null) {
                return -2;
            }
            try {
                zipInputStream2.close();
                return -2;
            } catch (java.io.IOException unused7) {
                return -2;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                } catch (java.io.IOException unused8) {
                }
            }
            throw th;
        }
    }
}
