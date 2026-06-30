package a25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82443d = 0;

    public b(a25.c cVar, a25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82443d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82443d;
        this.f82443d = i17 + 1;
        if (i17 == 0) {
            return aq1.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
