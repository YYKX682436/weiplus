package ir4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f375794d = 0;

    public b(ir4.c cVar, ir4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f375794d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f375794d;
        this.f375794d = i17 + 1;
        if (i17 == 0) {
            return ir4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
