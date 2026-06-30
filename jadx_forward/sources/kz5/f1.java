package kz5;

/* loaded from: classes5.dex */
public final class f1 extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f395500e;

    /* renamed from: f, reason: collision with root package name */
    public int f395501f;

    /* renamed from: g, reason: collision with root package name */
    public int f395502g;

    public f1(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f395500e = list;
    }

    @Override // kz5.b
    public int d() {
        return this.f395502g;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        int i18 = this.f395502g;
        if (i17 >= 0 && i17 < i18) {
            return this.f395500e.get(this.f395501f + i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }
}
