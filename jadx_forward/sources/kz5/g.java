package kz5;

/* loaded from: classes5.dex */
public final class g extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final kz5.h f395503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f395504f;

    /* renamed from: g, reason: collision with root package name */
    public final int f395505g;

    public g(kz5.h list, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f395503e = list;
        this.f395504f = i17;
        kz5.h.f395506d.a(i17, i18, list.d());
        this.f395505g = i18 - i17;
    }

    @Override // kz5.b
    public int d() {
        return this.f395505g;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        int i18 = this.f395505g;
        if (i17 >= 0 && i17 < i18) {
            return this.f395503e.get(this.f395504f + i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }
}
