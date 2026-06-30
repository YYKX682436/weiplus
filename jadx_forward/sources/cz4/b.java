package cz4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306567d = 0;

    public b(cz4.c cVar, cz4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306567d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306567d;
        this.f306567d = i17 + 1;
        if (i17 == 0) {
            return cz4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
