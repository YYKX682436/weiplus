package ya0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541943d = 0;

    public b(ya0.c cVar, ya0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541943d;
        this.f541943d = i17 + 1;
        if (i17 == 0) {
            return ya0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
