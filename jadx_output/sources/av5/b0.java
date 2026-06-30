package av5;

/* loaded from: classes16.dex */
public final class b0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14356e;

    public b0(int i17, byte[] bArr) {
        super(i17);
        this.f14356e = bArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return cv5.c.d(this.f14356e, ((av5.b0) obj).f14356e);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.b0) && cv5.c.d(this.f14356e, ((av5.b0) obj).f14356e) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f14356e);
    }
}
