package ck;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f42290d = 0;

    public b(ck.c cVar, ck.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f42290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f42290d;
        this.f42290d = i17 + 1;
        if (i17 == 0) {
            return ck.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
