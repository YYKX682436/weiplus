package od0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426062d = 0;

    public b(od0.c cVar, od0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426062d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426062d;
        this.f426062d = i17 + 1;
        if (i17 == 0) {
            return od0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
