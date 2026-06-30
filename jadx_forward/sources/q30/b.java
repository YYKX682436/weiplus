package q30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441430d = 0;

    public b(q30.c cVar, q30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441430d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441430d;
        this.f441430d = i17 + 1;
        if (i17 == 0) {
            return q30.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
