package av5;

/* loaded from: classes16.dex */
public final class p0 extends av5.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final av5.p0 f14451f = new av5.p0(0, av5.y.f14461e);

    /* renamed from: e, reason: collision with root package name */
    public final short[] f14452e;

    public p0(int i17, short[] sArr) {
        super(i17);
        this.f14452e = sArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return cv5.c.e(this.f14452e, ((av5.p0) obj).f14452e);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.p0) && cv5.c.e(this.f14452e, ((av5.p0) obj).f14452e) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f14452e);
    }
}
