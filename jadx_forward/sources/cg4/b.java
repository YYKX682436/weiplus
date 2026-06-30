package cg4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f122690d = 0;

    public b(cg4.c cVar, cg4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f122690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f122690d;
        this.f122690d = i17 + 1;
        if (i17 == 0) {
            return cg4.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
