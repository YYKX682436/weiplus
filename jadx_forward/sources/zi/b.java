package zi;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f554609a;

    public b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f554609a = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    /* renamed from: equals */
    public boolean m179013xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof zi.b)) {
            return false;
        }
        return java.util.Arrays.equals(this.f554609a, ((zi.b) obj).f554609a);
    }

    /* renamed from: hashCode */
    public int m179014x8cdac1b() {
        return java.util.Arrays.hashCode(this.f554609a);
    }

    /* renamed from: toString */
    public java.lang.String m179015x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0x");
        for (byte b17 : this.f554609a) {
            sb6.append(java.lang.Integer.toHexString(b17 & 255));
        }
        return sb6.toString();
    }
}
