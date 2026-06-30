package i14;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368854d = 0;

    public b(i14.c cVar, i14.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368854d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368854d;
        this.f368854d = i17 + 1;
        if (i17 == 0) {
            return i14.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
