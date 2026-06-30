package wn3;

/* loaded from: classes8.dex */
public final class c implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f529061d;

    public c(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("apdu is null");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        if (bArr2.length < 2) {
            throw new java.lang.IllegalArgumentException("apdu must be at least 2 bytes long");
        }
        this.f529061d = bArr2;
    }

    public void a(wn3.c cVar) {
        byte[] bArr = this.f529061d;
        int length = bArr.length;
        this.f529061d = java.util.Arrays.copyOf(bArr, (bArr.length + cVar.f529061d.length) - 2);
        int i17 = length - 2;
        byte[] bArr2 = (byte[]) cVar.f529061d.clone();
        int length2 = bArr2.length;
        int i18 = 0;
        while (i18 < length2) {
            this.f529061d[i17] = bArr2[i18];
            i18++;
            i17++;
        }
    }

    public short b() {
        return (short) (this.f529061d[r0.length - 2] & 255);
    }

    /* renamed from: equals */
    public boolean m174176xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wn3.c) {
            return java.util.Arrays.equals(this.f529061d, ((wn3.c) obj).f529061d);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m174177x8cdac1b() {
        return java.util.Arrays.hashCode(this.f529061d);
    }

    /* renamed from: toString */
    public java.lang.String m174178x9616526c() {
        return zn3.a.a(this.f529061d);
    }
}
