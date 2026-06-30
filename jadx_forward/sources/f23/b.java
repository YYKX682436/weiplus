package f23;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340503d = 0;

    public b(f23.c cVar, f23.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340503d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340503d;
        this.f340503d = i17 + 1;
        if (i17 == 0) {
            return f23.d2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
