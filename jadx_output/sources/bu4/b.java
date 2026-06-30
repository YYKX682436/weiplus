package bu4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24608d = 0;

    public b(bu4.c cVar, bu4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24608d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24608d;
        this.f24608d = i17 + 1;
        if (i17 == 0) {
            return bu4.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
