package z33;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551495d = 0;

    public b(z33.c cVar, z33.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551495d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551495d;
        this.f551495d = i17 + 1;
        if (i17 == 0) {
            return z33.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
