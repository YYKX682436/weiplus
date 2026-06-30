package ni4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419298d = 0;

    public b(ni4.c cVar, ni4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419298d;
        this.f419298d = i17 + 1;
        if (i17 == 0) {
            return ni4.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
