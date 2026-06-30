package nq1;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420495d = 0;

    public h(nq1.i iVar, nq1.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420495d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420495d;
        this.f420495d = i17 + 1;
        if (i17 == 0) {
            return nq1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
