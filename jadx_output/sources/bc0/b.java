package bc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19141d = 0;

    public b(bc0.c cVar, bc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19141d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19141d;
        this.f19141d = i17 + 1;
        if (i17 == 0) {
            return qv.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
