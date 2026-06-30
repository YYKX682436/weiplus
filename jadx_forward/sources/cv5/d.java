package cv5;

/* loaded from: classes13.dex */
public abstract class d {
    public static byte[] a(java.io.InputStream inputStream, int i17) {
        if (i17 <= 0) {
            i17 = 32768;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i17);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
