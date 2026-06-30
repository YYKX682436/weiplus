package zq1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556510d = 0;

    public b(zq1.c cVar, zq1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556510d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556510d;
        this.f556510d = i17 + 1;
        if (i17 == 0) {
            return br1.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
