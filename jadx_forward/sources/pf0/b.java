package pf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435289d = 0;

    public b(pf0.c cVar, pf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435289d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435289d;
        this.f435289d = i17 + 1;
        if (i17 == 0) {
            return kn4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
