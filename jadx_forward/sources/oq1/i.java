package oq1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428871d = 0;

    public i(oq1.j jVar, oq1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428871d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428871d;
        this.f428871d = i17 + 1;
        if (i17 == 0) {
            return nq1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
