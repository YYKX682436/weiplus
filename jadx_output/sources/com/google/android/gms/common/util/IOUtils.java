package com.google.android.gms.common.util;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream) {
        return readInputStreamFully(inputStream, true);
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z17, int i17) {
        byte[] bArr = new byte[i17];
        long j17 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i17);
                if (read == -1) {
                    break;
                }
                j17 += read;
                outputStream.write(bArr, 0, read);
            } catch (java.lang.Throwable th6) {
                if (z17) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th6;
            }
        }
        if (z17) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j17;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream, boolean z17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z17, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
