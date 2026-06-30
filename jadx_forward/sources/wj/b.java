package wj;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f527908d = 0;

    public b(wj.c cVar, wj.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f527908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f527908d;
        this.f527908d = i17 + 1;
        if (i17 == 0) {
            return wj.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
