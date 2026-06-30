package xj5;

/* loaded from: classes5.dex */
public final class b extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f536432u;

    public b(int i17) {
        this.f536432u = i17;
    }

    @Override // xj5.a
    public int c() {
        return 6;
    }

    @Override // xj5.a
    public boolean d(xj5.a aVar) {
        xj5.b other = (xj5.b) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f536432u == other.f536432u;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f536422n;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.b other = (xj5.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }
}
