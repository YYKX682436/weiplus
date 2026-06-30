package xj5;

/* loaded from: classes8.dex */
public final class d extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final dm.s4 f536434u;

    public d(dm.s4 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f536434u = data;
    }

    @Override // xj5.a
    public int c() {
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f536434u.f68258x41d5e0c;
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f536423o;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.d other = (xj5.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return (int) (this.f536434u.f68261x9c2463f1 - other.f536434u.f68261x9c2463f1);
    }
}
