package uk;

/* loaded from: classes8.dex */
public final class p implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final int f510043d;

    public p(byte[] bArr) {
        int i17 = (bArr[1] << 8) & 65280;
        this.f510043d = i17;
        this.f510043d = i17 + (bArr[0] & 255);
    }

    /* renamed from: equals */
    public boolean m168192xb2c87fbf(java.lang.Object obj) {
        return obj != null && (obj instanceof uk.p) && this.f510043d == ((uk.p) obj).f510043d;
    }

    /* renamed from: hashCode */
    public int m168193x8cdac1b() {
        return this.f510043d;
    }

    public p(int i17) {
        this.f510043d = i17;
    }
}
