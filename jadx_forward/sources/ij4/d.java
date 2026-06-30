package ij4;

/* loaded from: classes10.dex */
public final class d extends xm3.a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public mj4.h f373250d;

    public d(mj4.h info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f373250d = info;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ij4.d other = (ij4.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) this.f373250d).l(), ((mj4.k) other.f373250d).l());
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ij4.d other = (ij4.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return ((mj4.k) this.f373250d).l();
    }
}
