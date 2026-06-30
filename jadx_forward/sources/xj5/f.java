package xj5;

/* loaded from: classes8.dex */
public final class f extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final oo0.a f536435u;

    public f(oo0.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f536435u = data;
        this.f536430e = 2;
    }

    @Override // xj5.a
    public java.util.Map a() {
        return kz5.b1.e(new jz5.l("group_live_id", java.lang.Long.valueOf(((oo0.d) this.f536435u).f67834x41d5e0c)));
    }

    @Override // xj5.a
    public int c() {
        return 5;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return ((oo0.d) this.f536435u).f67834x41d5e0c;
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f536424p;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.f other = (xj5.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return (int) (((oo0.d) this.f536435u).f67837x9c2463f1 - ((oo0.d) other.f536435u).f67837x9c2463f1);
    }
}
