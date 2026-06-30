package wn3;

/* loaded from: classes8.dex */
public final class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f529059d;

    public a(byte[] bArr) {
        this.f529059d = (byte[]) bArr.clone();
        a();
    }

    public final void a() {
        byte[] bArr = this.f529059d;
        if (bArr.length < 4) {
            throw new java.lang.IllegalArgumentException("apdu must be at least 4 bytes long");
        }
        if (bArr.length == 4) {
            return;
        }
        int i17 = bArr[4] & 255;
        if (bArr.length == 5) {
            return;
        }
        if (i17 != 0) {
            if (bArr.length == i17 + 5) {
                return;
            }
            if (bArr.length == i17 + 6) {
                byte b17 = bArr[bArr.length - 1];
                return;
            }
            throw new java.lang.IllegalArgumentException("Invalid APDU: length=" + bArr.length + ", b1=" + i17);
        }
        if (bArr.length < 7) {
            throw new java.lang.IllegalArgumentException("Invalid APDU: length=" + bArr.length + ", b1=" + i17);
        }
        int i18 = ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        if (bArr.length == 7) {
            return;
        }
        if (i18 == 0) {
            throw new java.lang.IllegalArgumentException("Invalid APDU: length=" + bArr.length + ", b1=" + i17 + ", b2||b3=" + i18);
        }
        if (bArr.length == i18 + 7) {
            return;
        }
        if (bArr.length == i18 + 9) {
            int length = bArr.length - 2;
            byte b18 = bArr[length];
            byte b19 = bArr[length + 1];
        } else {
            throw new java.lang.IllegalArgumentException("Invalid APDU: length=" + bArr.length + ", b1=" + i17 + ", b2||b3=" + i18);
        }
    }

    /* renamed from: equals */
    public boolean m174172xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wn3.a) {
            return java.util.Arrays.equals(this.f529059d, ((wn3.a) obj).f529059d);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m174173x8cdac1b() {
        return java.util.Arrays.hashCode(this.f529059d);
    }

    /* renamed from: toString */
    public java.lang.String m174174x9616526c() {
        return zn3.a.a(this.f529059d);
    }

    public a(java.lang.String str) {
        this.f529059d = zn3.a.b(str);
        a();
    }
}
