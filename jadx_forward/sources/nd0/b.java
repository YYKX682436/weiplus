package nd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417781d = 0;

    public b(nd0.c cVar, nd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417781d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417781d;
        this.f417781d = i17 + 1;
        if (i17 == 0) {
            return md0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
