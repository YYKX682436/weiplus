package x53;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533654d = 0;

    public b(x53.c cVar, x53.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533654d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533654d;
        this.f533654d = i17 + 1;
        if (i17 == 0) {
            return x53.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
