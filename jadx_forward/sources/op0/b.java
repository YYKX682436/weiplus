package op0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428757d = 0;

    public b(op0.c cVar, op0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428757d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428757d;
        this.f428757d = i17 + 1;
        if (i17 == 0) {
            return op0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
