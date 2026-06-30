package z53;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551778d = 0;

    public b(z53.c cVar, z53.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551778d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551778d;
        this.f551778d = i17 + 1;
        if (i17 == 0) {
            return z53.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
