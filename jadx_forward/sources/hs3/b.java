package hs3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366101d = 0;

    public b(hs3.c cVar, hs3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366101d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366101d;
        this.f366101d = i17 + 1;
        if (i17 == 0) {
            return hs3.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
