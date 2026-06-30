package pv;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440012d = 0;

    public b(pv.c cVar, pv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440012d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440012d;
        this.f440012d = i17 + 1;
        if (i17 == 0) {
            return ov.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
