package ss0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493412d = 0;

    public b(ss0.c cVar, ss0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493412d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493412d;
        this.f493412d = i17 + 1;
        if (i17 == 0) {
            return rs0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
