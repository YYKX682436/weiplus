package hu;

/* loaded from: classes9.dex */
public final class b extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f366529d;

    /* renamed from: e, reason: collision with root package name */
    public final s15.h f366530e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f366531f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f366532g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f366533h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f366534i;

    public b(int i17, s15.h recordDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        this.f366529d = i17;
        this.f366530e = recordDataItem;
        this.f366531f = "";
        this.f366532g = "";
        this.f366533h = "";
        this.f366534i = "";
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        hu.b other = (hu.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f366530e.mo516x5c5a33d4(other.f366530e);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        hu.b other = (hu.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f366529d, other.f366529d);
    }

    @Override // xm3.a, in5.c
    public int h() {
        ((ju.e) ((gu.g) i95.n0.c(gu.g.class))).getClass();
        s15.h recordDataItem = this.f366530e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        return wu.b2.f531078a.b(recordDataItem);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f366529d);
    }
}
