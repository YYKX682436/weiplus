package cz;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306462d = 0;

    public b(cz.c cVar, cz.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306462d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306462d;
        this.f306462d = i17 + 1;
        if (i17 == 0) {
            return cz.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
