package qe4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443594d = 0;

    public b(qe4.c cVar, qe4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443594d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443594d;
        this.f443594d = i17 + 1;
        if (i17 == 0) {
            return qe4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
