package jy4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384065d = 0;

    public f(jy4.g gVar, jy4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384065d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384065d;
        this.f384065d = i17 + 1;
        if (i17 == 0) {
            return jy4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
