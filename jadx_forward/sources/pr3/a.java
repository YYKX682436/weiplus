package pr3;

/* loaded from: classes.dex */
public final class a extends pr3.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f439483d;

    /* renamed from: e, reason: collision with root package name */
    public final int f439484e;

    public a(int i17, int i18) {
        super(i17, null);
        this.f439483d = i17;
        this.f439484e = i18;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return m158880xb2c87fbf(other);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f439483d, other.i());
    }

    /* renamed from: equals */
    public boolean m158880xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3.a)) {
            return false;
        }
        pr3.a aVar = (pr3.a) obj;
        return this.f439483d == aVar.f439483d && this.f439484e == aVar.f439484e;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f439483d;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }

    /* renamed from: hashCode */
    public int m158881x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f439483d) * 31) + java.lang.Integer.hashCode(this.f439484e);
    }

    @Override // pr3.e
    public int i() {
        return this.f439483d;
    }

    @Override // xm3.d
    public boolean s0(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof pr3.a) {
            if (this.f439484e == ((pr3.a) other).f439484e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m158882x9616526c() {
        return "Gap(id=" + this.f439483d + ", height=" + this.f439484e + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f439483d);
    }

    @Override // xm3.d
    public java.lang.Object y0() {
        return new pr3.a(this.f439483d, this.f439484e);
    }
}
