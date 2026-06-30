package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public final int f215392a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f215393b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f215394c;

    public ba(int i17, java.lang.String name, yz5.a onShow) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onShow, "onShow");
        this.f215392a = i17;
        this.f215393b = name;
        this.f215394c = onShow;
    }

    /* renamed from: equals */
    public boolean m63067xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba baVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba) obj;
        return this.f215392a == baVar.f215392a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f215393b, baVar.f215393b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f215394c, baVar.f215394c);
    }

    /* renamed from: hashCode */
    public int m63068x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f215392a) * 31) + this.f215393b.hashCode()) * 31) + this.f215394c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m63069x9616526c() {
        return "DialogRequest(priority=" + this.f215392a + ", name=" + this.f215393b + ", onShow=" + this.f215394c + ')';
    }
}
