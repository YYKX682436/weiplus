package ag0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4671d = 0;

    public b(ag0.c cVar, ag0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4671d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4671d;
        this.f4671d = i17 + 1;
        if (i17 == 0) {
            return ag0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
