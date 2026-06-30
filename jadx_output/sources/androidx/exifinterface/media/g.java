package androidx.exifinterface.media;

/* loaded from: classes13.dex */
public abstract class g {
    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e17) {
                throw e17;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static long[] b(java.lang.Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            jArr[i17] = iArr[i17];
        }
        return jArr;
    }

    public static int c(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i17 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i17;
            }
            i17 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static void d(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i17) {
        byte[] bArr = new byte[8192];
        while (i17 > 0) {
            int min = java.lang.Math.min(i17, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read != min) {
                throw new java.io.IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i17 -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i17 = 0; i17 < bArr2.length; i17++) {
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
        }
        return true;
    }
}
