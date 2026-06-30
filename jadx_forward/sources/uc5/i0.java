package uc5;

/* loaded from: classes10.dex */
public final class i0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f508034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.util.List personItems) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(personItems, "personItems");
        this.f508034d = personItems;
    }

    @Override // uc5.l0, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        uc5.l0 other = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof uc5.i0) {
            return 0;
        }
        if (other instanceof uc5.k0 ? true : other instanceof uc5.h0 ? true : other instanceof uc5.j0) {
            return -1;
        }
        throw new jz5.j();
    }

    @Override // xm3.a
    /* renamed from: equals */
    public boolean mo148314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc5.i0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508034d, ((uc5.i0) obj).f508034d);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return -1;
    }

    @Override // xm3.a
    /* renamed from: hashCode */
    public int mo148315x8cdac1b() {
        return this.f508034d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167841x9616526c() {
        return "PersonRecommend(personItems=" + this.f508034d + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return "person_recommend";
    }
}
