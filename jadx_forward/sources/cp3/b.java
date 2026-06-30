package cp3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302494d = 0;

    public b(cp3.c cVar, cp3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302494d;
        this.f302494d = i17 + 1;
        if (i17 == 0) {
            return cp3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
