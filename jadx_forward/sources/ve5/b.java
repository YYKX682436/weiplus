package ve5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517648d = 0;

    public b(ve5.c cVar, ve5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517648d;
        this.f517648d = i17 + 1;
        if (i17 == 0) {
            return ki5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
