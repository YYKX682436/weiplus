package it4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f376120d = 0;

    public b(it4.c cVar, it4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f376120d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f376120d;
        this.f376120d = i17 + 1;
        if (i17 == 0) {
            return it4.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
