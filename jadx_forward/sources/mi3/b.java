package mi3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408308d = 0;

    public b(mi3.c cVar, mi3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408308d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408308d;
        this.f408308d = i17 + 1;
        if (i17 == 0) {
            return py3.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
