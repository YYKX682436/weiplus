package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.common.util.IOUtils */
/* loaded from: classes13.dex */
public final class C2001xa159df2b {
    private C2001xa159df2b() {
    }

    /* renamed from: closeQuietly */
    public static void m18579xd71209a9(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: copyStream */
    public static long m18581xc9a2bf55(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        return m18582xc9a2bf55(inputStream, outputStream, false, 1024);
    }

    /* renamed from: isGzipByteBuffer */
    public static boolean m18583xf4a9a02c(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    /* renamed from: readInputStreamFully */
    public static byte[] m18584x493fbfb6(java.io.InputStream inputStream) {
        return m18585x493fbfb6(inputStream, true);
    }

    @java.lang.Deprecated
    /* renamed from: toByteArray */
    public static byte[] m18586x5f01b1f6(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(inputStream);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: closeQuietly */
    public static void m18580xd71209a9(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: copyStream */
    public static long m18582xc9a2bf55(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z17, int i17) {
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
                    m18580xd71209a9(inputStream);
                    m18580xd71209a9(outputStream);
                }
                throw th6;
            }
        }
        if (z17) {
            m18580xd71209a9(inputStream);
            m18580xd71209a9(outputStream);
        }
        return j17;
    }

    @java.lang.Deprecated
    /* renamed from: readInputStreamFully */
    public static byte[] m18585x493fbfb6(java.io.InputStream inputStream, boolean z17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        m18582xc9a2bf55(inputStream, byteArrayOutputStream, z17, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
