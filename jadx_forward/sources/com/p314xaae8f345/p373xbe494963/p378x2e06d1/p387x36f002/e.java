package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
public final class e {
    public static long a(java.io.File file, int i17) {
        long length;
        long j17 = 0;
        if (i17 <= 0) {
            return 0L;
        }
        try {
            for (java.io.File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = a(file2, i17 - 1);
                } else {
                    length = file2.length();
                }
                j17 += length;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("FileUtil", "getFolderSize exception " + e17.toString());
        }
        return j17;
    }

    public static void a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
