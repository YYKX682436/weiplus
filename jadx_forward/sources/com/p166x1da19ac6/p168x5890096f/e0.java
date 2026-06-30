package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes12.dex */
public abstract class e0 {
    public static void a(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (java.io.File file2 : listFiles) {
                a(file2);
            }
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            parentFile.toString();
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new java.io.IOException("Could not delete file " + file);
    }

    public static void b(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new java.io.IOException("cannot list directory " + file);
            }
            for (java.io.File file2 : listFiles) {
                b(file2);
            }
            return;
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                try {
                    randomAccessFile.close();
                } catch (java.lang.Throwable th8) {
                    th6.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    public static java.lang.String[] c() {
        java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
        java.util.TreeSet treeSet = new java.util.TreeSet();
        if (android.os.Process.is64Bit()) {
            treeSet.add("arm64-v8a");
            treeSet.add("x86_64");
        } else {
            treeSet.add("armeabi-v7a");
            treeSet.add("x86");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static boolean d(android.content.Context context, int i17) {
        if (i17 == 2) {
            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(new java.io.File(context.getApplicationInfo().sourceDir));
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    java.util.zip.ZipEntry nextElement = entries.nextElement();
                    if (nextElement != null && nextElement.getName().endsWith(".so") && nextElement.getName().contains("/lib")) {
                        r1 = nextElement.getMethod() == 0;
                        zipFile.close();
                    }
                }
                zipFile.close();
                return false;
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    try {
                        zipFile.close();
                    } catch (java.lang.Throwable th8) {
                        th6.addSuppressed(th8);
                    }
                    throw th7;
                }
            }
        }
        if ((context.getApplicationInfo().flags & 268435456) != 0) {
            r1 = false;
        }
        return r1;
    }
}
