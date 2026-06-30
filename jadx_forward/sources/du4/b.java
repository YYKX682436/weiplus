package du4;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325314d = 0;

    public b(du4.c cVar, du4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325314d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325314d;
        this.f325314d = i17 + 1;
        if (i17 == 0) {
            return du4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
