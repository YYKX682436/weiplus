package rh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477112d = 0;

    public b(rh0.c cVar, rh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477112d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477112d;
        this.f477112d = i17 + 1;
        if (i17 == 0) {
            return qh0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
