package pr3;

/* loaded from: classes.dex */
public final class d extends pr3.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f439500d;

    /* renamed from: e, reason: collision with root package name */
    public final int f439501e;

    /* renamed from: f, reason: collision with root package name */
    public final int f439502f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f439503g;

    public d(int i17, int i18, int i19, boolean z17) {
        super(i17, null);
        this.f439500d = i17;
        this.f439501e = i18;
        this.f439502f = i19;
        this.f439503g = z17;
    }

    public static pr3.d j(pr3.d dVar, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        if ((i27 & 1) != 0) {
            i17 = dVar.f439500d;
        }
        if ((i27 & 2) != 0) {
            i18 = dVar.f439501e;
        }
        if ((i27 & 4) != 0) {
            i19 = dVar.f439502f;
        }
        if ((i27 & 8) != 0) {
            z17 = dVar.f439503g;
        }
        dVar.getClass();
        return new pr3.d(i17, i18, i19, z17);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return m158887xb2c87fbf(other);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f439500d, other.i());
    }

    /* renamed from: equals */
    public boolean m158887xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3.d)) {
            return false;
        }
        pr3.d dVar = (pr3.d) obj;
        return this.f439500d == dVar.f439500d && this.f439501e == dVar.f439501e && this.f439502f == dVar.f439502f && this.f439503g == dVar.f439503g;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f439501e;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }

    /* renamed from: hashCode */
    public int m158888x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f439500d) * 31) + java.lang.Integer.hashCode(this.f439501e)) * 31) + java.lang.Integer.hashCode(this.f439502f)) * 31) + java.lang.Boolean.hashCode(this.f439503g);
    }

    @Override // pr3.e
    public int i() {
        return this.f439500d;
    }

    @Override // xm3.d
    public boolean s0(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof pr3.d) {
            if (this.f439501e == ((pr3.d) other).f439501e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m158889x9616526c() {
        return "Label(id=" + this.f439500d + ", title=" + this.f439501e + ", marginTop=" + this.f439502f + ", hasChildren=" + this.f439503g + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f439501e);
    }

    @Override // xm3.d
    public java.lang.Object y0() {
        return j(this, 0, 0, 0, false, 15, null);
    }
}
