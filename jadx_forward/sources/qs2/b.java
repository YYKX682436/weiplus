package qs2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447789d = 0;

    public b(qs2.c cVar, qs2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447789d;
        this.f447789d = i17 + 1;
        if (i17 == 0) {
            return qs2.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
