package f50;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341109d = 0;

    public b(f50.c cVar, f50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341109d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341109d;
        this.f341109d = i17 + 1;
        if (i17 == 0) {
            return e50.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
