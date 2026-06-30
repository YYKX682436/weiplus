package tp1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f502561d = 0;

    public b(tp1.c cVar, tp1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f502561d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f502561d;
        this.f502561d = i17 + 1;
        if (i17 == 0) {
            return tp1.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
