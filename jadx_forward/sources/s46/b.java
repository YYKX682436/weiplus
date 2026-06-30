package s46;

/* loaded from: classes12.dex */
public abstract class b {
    static {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(1024L);
        valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf)))));
        valueOf.multiply(java.math.BigInteger.valueOf(1024L).multiply(java.math.BigInteger.valueOf(1152921504606846976L)));
    }

    public static void a(java.io.File file, java.io.File file2) {
        if (file == null) {
            throw new java.lang.NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new java.lang.NullPointerException("Destination must not be null");
        }
        if (file.exists()) {
            return;
        }
        throw new java.io.FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void b(java.io.File file, java.io.File file2) {
        java.util.ArrayList arrayList;
        java.io.File[] listFiles;
        a(file, file2);
        if (!file.isDirectory()) {
            throw new java.io.IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new java.io.IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath()) || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(listFiles.length);
            for (java.io.File file3 : listFiles) {
                arrayList.add(new java.io.File(file2, file3.getName()).getCanonicalPath());
            }
        }
        d(file, file2, null, true, arrayList);
    }

    public static void c(java.io.File file, java.io.File file2) {
        a(file, file2);
        if (file.isDirectory()) {
            throw new java.io.IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new java.io.IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        java.io.File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new java.io.IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            e(file, file2, true);
            return;
        }
        throw new java.io.IOException("Destination '" + file2 + "' exists but is read-only");
    }

    public static void d(java.io.File file, java.io.File file2, java.io.FileFilter fileFilter, boolean z17, java.util.List list) {
        java.io.File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles == null) {
            throw new java.io.IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new java.io.IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new java.io.IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new java.io.IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (java.io.File file3 : listFiles) {
            java.io.File file4 = new java.io.File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    d(file3, file4, fileFilter, z17, list);
                } else {
                    e(file3, file4, z17);
                }
            }
        }
        if (z17) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void e(java.io.File file, java.io.File file2, boolean z17) {
        if (file2.exists() && file2.isDirectory()) {
            throw new java.io.IOException("Destination '" + file2 + "' exists but is a directory");
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    java.nio.channels.FileChannel channel2 = fileOutputStream.getChannel();
                    try {
                        long size = channel.size();
                        long j17 = 0;
                        while (j17 < size) {
                            long j18 = size - j17;
                            long transferFrom = channel2.transferFrom(channel, j17, j18 > 31457280 ? 31457280L : j18);
                            if (transferFrom == 0) {
                                break;
                            } else {
                                j17 += transferFrom;
                            }
                        }
                        if (channel2 != null) {
                            channel2.close();
                        }
                        fileOutputStream.close();
                        channel.close();
                        fileInputStream.close();
                        long length = file.length();
                        long length2 = file2.length();
                        if (length == length2) {
                            if (z17) {
                                file2.setLastModified(file.lastModified());
                                return;
                            }
                            return;
                        }
                        throw new java.io.IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
