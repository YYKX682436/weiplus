package a70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f83419d = 0;

    public b(a70.c cVar, a70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f83419d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f83419d;
        this.f83419d = i17 + 1;
        if (i17 == 0) {
            return a70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
