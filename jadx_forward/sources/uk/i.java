package uk;

/* loaded from: classes8.dex */
public abstract class i {
    public static void a(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.util.zip.ZipFile) {
                ((java.util.zip.ZipFile) obj).close();
                return;
            }
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
            } else {
                if (obj instanceof java.lang.AutoCloseable) {
                    ((java.lang.AutoCloseable) obj).close();
                    return;
                }
                throw new java.lang.IllegalArgumentException("Object " + obj + " is not closable.");
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean b(java.io.InputStream inputStream, byte[] bArr, int i17, int i18) {
        int i19 = 0;
        while (i19 < i18) {
            int read = inputStream.read(bArr, i17 + i19, i18 - i19);
            if (read < 0) {
                return false;
            }
            i19 += read;
        }
        return true;
    }

    public static int c(java.io.InputStream inputStream, boolean z17) {
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        int read3 = inputStream.read() & 255;
        int read4 = inputStream.read() & 255;
        if (!z17) {
            return (read4 << 0) | (read << 24) | (read2 << 16) | (read3 << 8);
        }
        int i17 = ((read4 & 127) << 24) | (read3 << 16) | (read2 << 8) | (read << 0);
        return (read4 & 128) != 0 ? -i17 : i17;
    }

    public static long d(java.io.InputStream inputStream, boolean z17) {
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        int read3 = inputStream.read() & 255;
        int read4 = inputStream.read() & 255;
        int read5 = inputStream.read() & 255;
        int read6 = inputStream.read() & 255;
        int read7 = inputStream.read() & 255;
        int read8 = inputStream.read() & 255;
        if (!z17) {
            return (read2 << 48) | (read << 56) | (read3 << 40) | (read4 << 32) | (read5 << 24) | (read6 << 16) | (read7 << 8) | (read8 << 0);
        }
        long j17 = (read6 << 40) | ((read8 & 127) << 56) | (read7 << 48) | (read5 << 32) | (read4 << 24) | (read3 << 16) | (read2 << 8) | (read << 0);
        return (read8 & 128) != 0 ? -j17 : j17;
    }
}
