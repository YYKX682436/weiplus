package z02;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f550729d = 0;

    public b(z02.c cVar, z02.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f550729d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f550729d;
        this.f550729d = i17 + 1;
        if (i17 == 0) {
            return z02.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
