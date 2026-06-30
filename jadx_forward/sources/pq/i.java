package pq;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439093d = 0;

    public i(pq.j jVar, pq.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439093d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439093d;
        this.f439093d = i17 + 1;
        if (i17 == 0) {
            return r10.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
