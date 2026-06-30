package r40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f451029d = 0;

    public b(r40.c cVar, r40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f451029d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f451029d;
        this.f451029d = i17 + 1;
        if (i17 == 0) {
            return r40.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
