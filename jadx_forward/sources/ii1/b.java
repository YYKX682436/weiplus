package ii1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f373146d = 0;

    public b(ii1.c cVar, ii1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f373146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f373146d;
        this.f373146d = i17 + 1;
        if (i17 == 0) {
            return hi1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
