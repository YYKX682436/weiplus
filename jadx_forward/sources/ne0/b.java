package ne0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418020d = 0;

    public b(ne0.c cVar, ne0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418020d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418020d;
        this.f418020d = i17 + 1;
        if (i17 == 0) {
            return ne0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
