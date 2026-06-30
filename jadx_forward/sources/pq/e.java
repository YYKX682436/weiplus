package pq;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439090d = 0;

    public e(pq.f fVar, pq.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439090d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439090d;
        this.f439090d = i17 + 1;
        if (i17 == 0) {
            return r10.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
