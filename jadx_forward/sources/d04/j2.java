package d04;

/* loaded from: classes8.dex */
public final class j2 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final sz3.w0 f306979d;

    /* renamed from: e, reason: collision with root package name */
    public final int f306980e;

    /* renamed from: f, reason: collision with root package name */
    public int f306981f;

    /* renamed from: g, reason: collision with root package name */
    public int f306982g;

    public j2(sz3.w0 item, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i19 & 4) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f306979d = item;
        this.f306980e = i17;
        this.f306981f = i18;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        d04.j2 other = (d04.j2) obj;
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
        d04.j2 other = (d04.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f306981f, other.f306981f);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f306980e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f306979d.f495663a);
    }
}
