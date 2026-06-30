package pp1;

/* loaded from: classes8.dex */
public final class a extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f438926d;

    /* renamed from: e, reason: collision with root package name */
    public int f438927e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d floatBallInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatBallInfo, "floatBallInfo");
        this.f438926d = floatBallInfo;
        this.f438927e = i17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pp1.a other = (pp1.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438926d, other.f438926d);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pp1.a other = (pp1.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f438927e, other.f438927e);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f438926d;
        sb6.append(c12886x91aa2b6d.f174582g);
        sb6.append('-');
        sb6.append(c12886x91aa2b6d.f174579d);
        return sb6.toString();
    }
}
