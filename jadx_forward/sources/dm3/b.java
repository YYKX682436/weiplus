package dm3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323203d = 0;

    public b(dm3.c cVar, dm3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323203d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323203d;
        this.f323203d = i17 + 1;
        if (i17 == 0) {
            return dm3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
