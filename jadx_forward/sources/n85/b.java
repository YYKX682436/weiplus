package n85;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417234d = 0;

    public b(n85.c cVar, n85.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417234d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417234d;
        this.f417234d = i17 + 1;
        if (i17 == 0) {
            return p85.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
