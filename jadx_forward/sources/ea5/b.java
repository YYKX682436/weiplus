package ea5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332216d = 0;

    public b(ea5.c cVar, ea5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332216d;
        this.f332216d = i17 + 1;
        if (i17 == 0) {
            return da5.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
