package yw3;

/* loaded from: classes4.dex */
public final class g extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f548277d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f548278e;

    public g(int i17, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f548277d = i17;
        this.f548278e = title;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yw3.g other = (yw3.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f548278e, other.f548278e);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yw3.g other = (yw3.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f548277d, other.f548277d);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f548277d);
    }
}
