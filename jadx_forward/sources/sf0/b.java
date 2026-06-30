package sf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f488476d = 0;

    public b(sf0.c cVar, sf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f488476d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f488476d;
        this.f488476d = i17 + 1;
        if (i17 == 0) {
            return sf0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
