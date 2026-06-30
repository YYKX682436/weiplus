package vz5;

/* loaded from: classes5.dex */
public abstract class a {
    public static final long a(java.io.InputStream inputStream, java.io.OutputStream out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputStream, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        byte[] bArr = new byte[i17];
        int read = inputStream.read(bArr);
        long j17 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j17 += read;
            read = inputStream.read(bArr);
        }
        return j17;
    }

    public static /* synthetic */ long b(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 8192;
        }
        return a(inputStream, outputStream, i17);
    }

    public static final byte[] c(java.io.InputStream inputStream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputStream, "<this>");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
