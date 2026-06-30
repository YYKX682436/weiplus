package av5;

/* loaded from: classes16.dex */
public final class a extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte f95884e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.b0 f95885f;

    public a(int i17, byte b17, av5.b0 b0Var) {
        super(i17);
        this.f95884e = b17;
        this.f95885f = b0Var;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.a aVar = (av5.a) obj;
        int d17 = cv5.c.d(this.f95885f.f95889e, aVar.f95885f.f95889e);
        if (d17 != 0) {
            return d17;
        }
        byte b17 = this.f95884e;
        byte b18 = aVar.f95884e;
        return b17 == b18 ? 0 : (b17 & 255) < (b18 & 255) ? -1 : 1;
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof av5.a)) {
            return false;
        }
        av5.a aVar = (av5.a) obj;
        int d17 = cv5.c.d(this.f95885f.f95889e, aVar.f95885f.f95889e);
        if (d17 == 0) {
            byte b17 = this.f95884e;
            byte b18 = aVar.f95884e;
            d17 = b17 == b18 ? 0 : (b17 & 255) < (b18 & 255) ? -1 : 1;
        }
        return d17 == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Byte.valueOf(this.f95884e), this.f95885f);
    }
}
