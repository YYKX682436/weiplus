package kz1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395368d = 0;

    public b(kz1.c cVar, kz1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395368d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395368d;
        this.f395368d = i17 + 1;
        if (i17 == 0) {
            return kz1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
