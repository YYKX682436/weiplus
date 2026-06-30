package b25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f98928d = 0;

    public b(b25.c cVar, b25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98928d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f98928d;
        this.f98928d = i17 + 1;
        if (i17 == 0) {
            return b25.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
