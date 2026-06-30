package e71;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331401d = 0;

    public b(e71.c cVar, e71.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331401d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331401d;
        this.f331401d = i17 + 1;
        if (i17 == 0) {
            return e71.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
