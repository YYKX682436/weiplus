package oh3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426961d = 0;

    public b(oh3.c cVar, oh3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426961d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426961d;
        this.f426961d = i17 + 1;
        if (i17 == 0) {
            return oh3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
