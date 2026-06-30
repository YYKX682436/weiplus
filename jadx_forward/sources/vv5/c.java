package vv5;

/* loaded from: classes13.dex */
public final class c extends vv5.b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f522079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f522080b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteOrder f522081c;

    /* renamed from: d, reason: collision with root package name */
    public int f522082d;

    public c(byte[] bArr, int i17, int i18, java.nio.ByteOrder byteOrder) {
        this.f522079a = bArr;
        this.f522080b = i17;
        this.f522081c = byteOrder;
    }

    public int a() {
        int i17;
        int i18;
        int i19 = this.f522082d;
        int i27 = this.f522080b + i19;
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f522079a;
        if (this.f522081c == byteOrder) {
            int i28 = i27 + 1;
            int i29 = i28 + 1;
            int i37 = ((bArr[i27] & 255) << 24) | ((bArr[i28] & 255) << 16);
            i17 = i37 | ((bArr[i29] & 255) << 8);
            i18 = (bArr[i29 + 1] & 255) << 0;
        } else {
            int i38 = i27 + 1;
            int i39 = i38 + 1;
            int i47 = ((bArr[i27] & 255) << 0) | ((bArr[i38] & 255) << 8);
            i17 = i47 | ((bArr[i39] & 255) << 16);
            i18 = (bArr[i39 + 1] & 255) << 24;
        }
        int i48 = i17 | i18;
        this.f522082d = i19 + 4;
        return i48;
    }

    public short b() {
        int i17;
        byte b17;
        int i18 = this.f522082d;
        int i19 = this.f522080b + i18;
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f522079a;
        if (this.f522081c == byteOrder) {
            i17 = bArr[i19] << 8;
            b17 = bArr[i19 + 1];
        } else {
            i17 = bArr[i19 + 1] << 8;
            b17 = bArr[i19];
        }
        short s17 = (short) ((b17 & 255) | i17);
        this.f522082d = i18 + 2;
        return s17;
    }
}
