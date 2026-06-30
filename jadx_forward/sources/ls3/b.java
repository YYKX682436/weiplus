package ls3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402565d = 0;

    public b(ls3.c cVar, ls3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402565d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402565d;
        this.f402565d = i17 + 1;
        if (i17 == 0) {
            return ls3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
