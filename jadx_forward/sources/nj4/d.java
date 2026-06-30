package nj4;

/* loaded from: classes11.dex */
public final class d extends nj4.e {

    /* renamed from: e, reason: collision with root package name */
    public boolean f419467e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f419468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nj4.e groupData) {
        super(groupData.f419469d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupData, "groupData");
        this.f419468f = this.f419469d.f86667a;
    }

    @Override // nj4.e, nj4.i, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // nj4.e, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        compareTo((nj4.i) obj);
        return 0;
    }

    @Override // nj4.e, xm3.a, in5.c
    public int h() {
        return 5;
    }

    @Override // nj4.e
    /* renamed from: n */
    public int compareTo(nj4.i other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // nj4.e, xm3.d
    /* renamed from: o */
    public boolean X(nj4.i other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return (other instanceof nj4.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((nj4.d) other).f419469d.f86667a, this.f419469d.f86667a);
    }

    @Override // nj4.e, xm3.d
    public java.lang.String v() {
        return this.f419468f;
    }
}
