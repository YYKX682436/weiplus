package p94;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434428d = 0;

    public b(p94.c cVar, p94.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434428d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434428d;
        this.f434428d = i17 + 1;
        if (i17 == 0) {
            return n34.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
