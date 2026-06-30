package k40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385494d = 0;

    public b(k40.c cVar, k40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385494d;
        this.f385494d = i17 + 1;
        if (i17 == 0) {
            return k40.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
