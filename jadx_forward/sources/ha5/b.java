package ha5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361532d = 0;

    public b(ha5.c cVar, ha5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361532d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361532d;
        this.f361532d = i17 + 1;
        if (i17 == 0) {
            return ha5.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
