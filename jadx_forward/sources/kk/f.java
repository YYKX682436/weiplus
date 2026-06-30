package kk;

/* loaded from: classes7.dex */
public abstract class f {
    public static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream != null && outputStream != null) {
            try {
                byte[] bArr = new byte[4096];
                long j17 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        return j17;
                    }
                    outputStream.write(bArr, 0, read);
                    j17 += read;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileOperation", "copyStream error: %s", e17.getMessage());
            }
        }
        return 0L;
    }

    public static byte[] b(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i17 = 0;
        while (true) {
            try {
                i17 = inputStream.read(bArr, 0, 1024);
            } catch (java.io.IOException unused) {
            }
            if (i17 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i17);
        }
    }
}
