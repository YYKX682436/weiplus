package l11;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f396504d = 0;

    public b(l11.c cVar, l11.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396504d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f396504d;
        this.f396504d = i17 + 1;
        if (i17 == 0) {
            return l11.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
