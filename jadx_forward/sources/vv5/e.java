package vv5;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f522084a = 0;

    static {
        new java.util.concurrent.atomic.AtomicReference();
    }

    public static void a(java.io.InputStream inputStream, byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return;
        }
        if (inputStream == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        if (bArr == null) {
            throw new java.lang.NullPointerException("dst == null");
        }
        int length = bArr.length;
        if ((i17 | i18) < 0 || i17 > length || length - i17 < i18) {
            throw new java.lang.ArrayIndexOutOfBoundsException(i17);
        }
        while (i18 > 0) {
            int read = inputStream.read(bArr, i17, i18);
            if (read < 0) {
                throw new java.io.EOFException();
            }
            i17 += read;
            i18 -= read;
        }
    }
}
