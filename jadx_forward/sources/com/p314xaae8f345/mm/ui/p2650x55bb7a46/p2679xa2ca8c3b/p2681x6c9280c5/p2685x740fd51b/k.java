package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes9.dex */
public final class k extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final b11.e f286350d;

    public k(b11.e wrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapper, "wrapper");
        this.f286350d = wrapper;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.k other = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v(), other.v()) && this.f286350d.f98568b.m9576x3fdd41df() == other.f286350d.f98568b.m9576x3fdd41df();
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.k other = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return java.lang.Long.signum(this.f286350d.f98568b.m9576x3fdd41df() - other.f286350d.f98568b.m9576x3fdd41df());
    }

    @Override // xm3.d
    public java.lang.String v() {
        b11.e eVar = this.f286350d;
        java.lang.String j17 = eVar.f98568b.j();
        return j17 == null ? java.lang.String.valueOf(eVar.f98568b.hashCode()) : j17;
    }
}
