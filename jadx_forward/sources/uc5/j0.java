package uc5;

/* loaded from: classes10.dex */
public final class j0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f508044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f508045e;

    /* renamed from: f, reason: collision with root package name */
    public final long f508046f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f508047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String sectionKey, int i17, long j17) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sectionKey, "sectionKey");
        this.f508044d = sectionKey;
        this.f508045e = i17;
        this.f508046f = j17;
    }

    @Override // uc5.l0, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        uc5.l0 other = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof uc5.i0)) {
            boolean z17 = other instanceof uc5.j0;
            long j17 = this.f508046f;
            if (z17) {
                uc5.j0 j0Var = (uc5.j0) other;
                int j18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(j17, j0Var.f508046f);
                return j18 != 0 ? j18 : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f508045e, j0Var.f508045e);
            }
            if (!(other instanceof uc5.k0)) {
                if (other instanceof uc5.h0) {
                    return -1;
                }
                throw new jz5.j();
            }
            uc5.k0 k0Var = (uc5.k0) other;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508044d, k0Var.f508051e)) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(j17, k0Var.f508053g);
            }
        }
        return 1;
    }

    @Override // xm3.a
    /* renamed from: equals */
    public boolean mo148314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.j0)) {
            return false;
        }
        uc5.j0 j0Var = (uc5.j0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508044d, j0Var.f508044d) && this.f508045e == j0Var.f508045e && this.f508046f == j0Var.f508046f;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return -2;
    }

    @Override // xm3.a
    /* renamed from: hashCode */
    public int mo148315x8cdac1b() {
        return (((this.f508044d.hashCode() * 31) + java.lang.Integer.hashCode(this.f508045e)) * 31) + java.lang.Long.hashCode(this.f508046f);
    }

    /* renamed from: toString */
    public java.lang.String m167842x9616526c() {
        return "SectionPadding(sectionKey=" + this.f508044d + ", index=" + this.f508045e + ", anchorCreateTime=" + this.f508046f + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f508047g;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = "section_padding#" + this.f508044d + '#' + this.f508045e;
        this.f508047g = str2;
        return str2;
    }
}
