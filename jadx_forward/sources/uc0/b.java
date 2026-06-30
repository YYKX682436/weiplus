package uc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f507799d = 0;

    public b(uc0.c cVar, uc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f507799d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f507799d;
        this.f507799d = i17 + 1;
        if (i17 == 0) {
            return tc0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
