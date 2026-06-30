package av5;

/* loaded from: classes16.dex */
public final class a extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte f14351e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.b0 f14352f;

    public a(int i17, byte b17, av5.b0 b0Var) {
        super(i17);
        this.f14351e = b17;
        this.f14352f = b0Var;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.a aVar = (av5.a) obj;
        int d17 = cv5.c.d(this.f14352f.f14356e, aVar.f14352f.f14356e);
        if (d17 != 0) {
            return d17;
        }
        byte b17 = this.f14351e;
        byte b18 = aVar.f14351e;
        return b17 == b18 ? 0 : (b17 & 255) < (b18 & 255) ? -1 : 1;
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof av5.a)) {
            return false;
        }
        av5.a aVar = (av5.a) obj;
        int d17 = cv5.c.d(this.f14352f.f14356e, aVar.f14352f.f14356e);
        if (d17 == 0) {
            byte b17 = this.f14351e;
            byte b18 = aVar.f14351e;
            d17 = b17 == b18 ? 0 : (b17 & 255) < (b18 & 255) ? -1 : 1;
        }
        return d17 == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Byte.valueOf(this.f14351e), this.f14352f);
    }
}
