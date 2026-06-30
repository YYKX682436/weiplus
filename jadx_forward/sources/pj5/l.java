package pj5;

/* loaded from: classes9.dex */
public final class l extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.lo5 f436920d;

    public l(r45.lo5 remind) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remind, "remind");
        this.f436920d = remind;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pj5.l other = (pj5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        r45.lo5 lo5Var = this.f436920d;
        java.lang.String str = lo5Var.f461208d;
        r45.lo5 lo5Var2 = other.f436920d;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, lo5Var2.f461208d) && lo5Var.f461210f == lo5Var2.f461210f;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pj5.l other = (pj5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f436920d.f461210f - other.f436920d.f461210f;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String RemindId = this.f436920d.f461208d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(RemindId, "RemindId");
        return RemindId;
    }
}
