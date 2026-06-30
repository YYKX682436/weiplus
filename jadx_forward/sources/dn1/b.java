package dn1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323385d = 0;

    public b(dn1.c cVar, dn1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323385d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323385d;
        this.f323385d = i17 + 1;
        if (i17 == 0) {
            return dn1.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
