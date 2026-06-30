package av5;

/* loaded from: classes16.dex */
public final class b0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f95889e;

    public b0(int i17, byte[] bArr) {
        super(i17);
        this.f95889e = bArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return cv5.c.d(this.f95889e, ((av5.b0) obj).f95889e);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.b0) && cv5.c.d(this.f95889e, ((av5.b0) obj).f95889e) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return java.util.Arrays.hashCode(this.f95889e);
    }
}
