package st0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493728d = 0;

    public b(st0.c cVar, st0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493728d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493728d;
        this.f493728d = i17 + 1;
        if (i17 == 0) {
            return ro3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
