package rq;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f480245d = 0;

    public c(rq.d dVar, rq.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f480245d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f480245d;
        this.f480245d = i17 + 1;
        if (i17 == 0) {
            return z20.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
