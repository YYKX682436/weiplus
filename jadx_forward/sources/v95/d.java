package v95;

/* loaded from: classes12.dex */
public abstract class d {
    public static int a(java.io.InputStream inputStream) {
        return (c(inputStream) << 8) | c(inputStream);
    }

    public static long b(java.io.InputStream inputStream) {
        return c(inputStream) | (c(inputStream) << 8) | (c(inputStream) << 16) | (c(inputStream) << 24);
    }

    public static int c(java.io.InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new java.io.IOException("EOF");
    }

    public static void d(java.io.InputStream inputStream, byte[] bArr, int i17, int i18) {
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("length must be >= 0");
        }
        int i19 = 0;
        while (i19 < i18) {
            int read = inputStream.read(bArr, i17 + i19, i18 - i19);
            if (i19 == -1) {
                throw new java.io.IOException("EOF");
            }
            i19 += read;
        }
    }

    public static void e(java.io.InputStream inputStream, long j17) {
        while (true) {
            long skip = inputStream.skip(j17);
            if (skip <= 0) {
                break;
            } else {
                j17 -= skip;
            }
        }
        if (j17 != 0) {
            throw new java.io.IOException("Unable to skip");
        }
    }
}
