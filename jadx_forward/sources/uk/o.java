package uk;

/* loaded from: classes13.dex */
public final class o implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final long f510042d;

    public o(byte[] bArr) {
        long j17 = (bArr[3] << 24) & 4278190080L;
        this.f510042d = j17;
        long j18 = j17 + ((bArr[2] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680);
        this.f510042d = j18;
        long j19 = j18 + ((bArr[1] << 8) & 65280);
        this.f510042d = j19;
        this.f510042d = j19 + (bArr[0] & 255);
    }

    public byte[] a() {
        long j17 = this.f510042d;
        return new byte[]{(byte) (255 & j17), (byte) ((65280 & j17) >> 8), (byte) ((16711680 & j17) >> 16), (byte) ((4278190080L & j17) >> 24)};
    }

    /* renamed from: equals */
    public boolean m168190xb2c87fbf(java.lang.Object obj) {
        return obj != null && (obj instanceof uk.o) && this.f510042d == ((uk.o) obj).f510042d;
    }

    /* renamed from: hashCode */
    public int m168191x8cdac1b() {
        return (int) this.f510042d;
    }

    public o(long j17) {
        this.f510042d = j17;
    }
}
