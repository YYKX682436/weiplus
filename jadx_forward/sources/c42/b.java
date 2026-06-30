package c42;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119910d = 0;

    public b(c42.c cVar, c42.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119910d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119910d;
        this.f119910d = i17 + 1;
        if (i17 == 0) {
            return c42.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
