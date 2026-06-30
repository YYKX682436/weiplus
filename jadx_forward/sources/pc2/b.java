package pc2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434895d = 0;

    public b(pc2.c cVar, pc2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434895d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434895d;
        this.f434895d = i17 + 1;
        if (i17 == 0) {
            return pc2.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
