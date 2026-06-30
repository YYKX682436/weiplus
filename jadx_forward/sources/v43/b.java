package v43;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514767d = 0;

    public b(v43.c cVar, v43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514767d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514767d;
        this.f514767d = i17 + 1;
        if (i17 == 0) {
            return v43.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
