package e31;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f328605d = 0;

    public b(e31.c cVar, e31.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f328605d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f328605d;
        this.f328605d = i17 + 1;
        if (i17 == 0) {
            return sv.h0.INSTANCE;
        }
        if (i17 == 1) {
            return gt.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
