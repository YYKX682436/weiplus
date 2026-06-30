package sh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f489535d = 0;

    public b(sh0.c cVar, sh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f489535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f489535d;
        this.f489535d = i17 + 1;
        if (i17 == 0) {
            return th0.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
