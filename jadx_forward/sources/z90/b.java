package z90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552382d = 0;

    public b(z90.c cVar, z90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552382d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552382d;
        this.f552382d = i17 + 1;
        if (i17 == 0) {
            return z90.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
