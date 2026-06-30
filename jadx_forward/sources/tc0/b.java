package tc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f498644d = 0;

    public b(tc0.c cVar, tc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f498644d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f498644d;
        this.f498644d = i17 + 1;
        if (i17 == 0) {
            return tc0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
