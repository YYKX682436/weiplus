package n90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417311d = 0;

    public b(n90.c cVar, n90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417311d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417311d;
        this.f417311d = i17 + 1;
        if (i17 == 0) {
            return n90.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
