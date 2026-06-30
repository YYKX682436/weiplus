package jz1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384167d = 0;

    public b(jz1.c cVar, jz1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384167d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384167d;
        this.f384167d = i17 + 1;
        if (i17 == 0) {
            return jz1.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
