package b80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18240d = 0;

    public b(b80.c cVar, b80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18240d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18240d;
        this.f18240d = i17 + 1;
        if (i17 == 0) {
            return b80.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
