package d93;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f309059d = 0;

    public b(d93.c cVar, d93.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f309059d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f309059d;
        this.f309059d = i17 + 1;
        if (i17 == 0) {
            return d93.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
