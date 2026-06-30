package yw3;

/* loaded from: classes11.dex */
public final class s6 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f548414d;

    /* renamed from: e, reason: collision with root package name */
    public final int f548415e;

    /* renamed from: f, reason: collision with root package name */
    public final int f548416f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f548417g;

    public s6(java.lang.String id6, int i17, int i18, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f548414d = id6;
        this.f548415e = i17;
        this.f548416f = i18;
        this.f548417g = title;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yw3.s6 other = (yw3.s6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f548417g, other.f548417g);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yw3.s6 other = (yw3.s6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f548415e, other.f548415e);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f548414d;
    }
}
