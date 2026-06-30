package dh4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f314038d = 0;

    public c(dh4.d dVar, dh4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f314038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f314038d;
        this.f314038d = i17 + 1;
        if (i17 == 0) {
            return dh4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
