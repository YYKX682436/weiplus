package j40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379125d = 0;

    public b(j40.c cVar, j40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379125d;
        this.f379125d = i17 + 1;
        if (i17 == 0) {
            return j40.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
