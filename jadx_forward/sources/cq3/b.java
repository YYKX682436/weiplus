package cq3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302979d = 0;

    public b(cq3.c cVar, cq3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302979d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302979d;
        this.f302979d = i17 + 1;
        if (i17 == 0) {
            return cq3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
