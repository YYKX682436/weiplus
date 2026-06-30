package o81;

/* loaded from: classes7.dex */
public abstract class b implements o81.a {
    public static int a(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return 0;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr, i17, i18);
        wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        if (i18 == 4) {
            return wrap.getInt();
        }
        byte[] bArr2 = new byte[i18];
        wrap.get(bArr2);
        int i19 = 0;
        for (int i27 = 0; i27 < i18; i27++) {
            i19 |= bArr2[i27] << (((i18 - i27) - 1) * 8);
        }
        return i19;
    }
}
