package cg5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f122702d = 0;

    public b(cg5.c cVar, cg5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f122702d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f122702d;
        this.f122702d = i17 + 1;
        if (i17 == 0) {
            return cg5.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
