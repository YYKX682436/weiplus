package yw3;

/* loaded from: classes4.dex */
public final class j extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final yw3.p f548306d;

    public j(yw3.p info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f548306d = info;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yw3.j other = (yw3.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        yw3.p pVar = this.f548306d;
        java.lang.String u07 = pVar.u0();
        yw3.p pVar2 = other.f548306d;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u07, pVar2.u0()) && pVar.v0() == pVar2.v0();
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yw3.j other = (yw3.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f548306d.v0(), other.f548306d.v0());
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String t07 = this.f548306d.t0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "getId(...)");
        return t07;
    }
}
