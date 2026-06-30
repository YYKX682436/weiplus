package lc0;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399378d = 0;

    public b(lc0.c cVar, lc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399378d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399378d;
        this.f399378d = i17 + 1;
        if (i17 == 0) {
            return lc0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
