package av5;

/* loaded from: classes16.dex */
public final class p0 extends av5.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final av5.p0 f95984f = new av5.p0(0, av5.y.f95994e);

    /* renamed from: e, reason: collision with root package name */
    public final short[] f95985e;

    public p0(int i17, short[] sArr) {
        super(i17);
        this.f95985e = sArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return cv5.c.e(this.f95985e, ((av5.p0) obj).f95985e);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.p0) && cv5.c.e(this.f95985e, ((av5.p0) obj).f95985e) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return java.util.Arrays.hashCode(this.f95985e);
    }
}
