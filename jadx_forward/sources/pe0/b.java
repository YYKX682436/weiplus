package pe0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435126d = 0;

    public b(pe0.c cVar, pe0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435126d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435126d;
        this.f435126d = i17 + 1;
        if (i17 == 0) {
            return pe0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
