package x71;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533951d = 0;

    public b(x71.c cVar, x71.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533951d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533951d;
        this.f533951d = i17 + 1;
        if (i17 == 0) {
            return j81.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
