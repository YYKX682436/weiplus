package jj4;

/* loaded from: classes4.dex */
public final class b extends xm3.a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f381562d;

    public b(java.util.List infoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        this.f381562d = infoList;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        jj4.b other = (jj4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v(), other.v());
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        jj4.b other = (jj4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m141056x9616526c() {
        java.util.List list = this.f381562d;
        mj4.h hVar = (mj4.h) kz5.n0.Z(list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MultipleCardFeedItem[");
        sb6.append(mo148315x8cdac1b());
        sb6.append("], infoList size=");
        sb6.append(list.size());
        sb6.append(", info username:");
        sb6.append(hVar != null ? ((mj4.k) hVar).o() : null);
        sb6.append(", first status=");
        sb6.append(hVar != null ? hVar.toString() : null);
        return sb6.toString();
    }

    @Override // xm3.d
    public java.lang.String v() {
        return kz5.n0.g0(this.f381562d, null, null, null, 0, null, jj4.a.f381561d, 31, null);
    }
}
