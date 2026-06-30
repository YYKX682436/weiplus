package oy;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431353d = 0;

    public f(oy.g gVar, oy.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431353d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431353d;
        this.f431353d = i17 + 1;
        if (i17 == 0) {
            return te5.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
