package pe0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435129d = 0;

    public f(pe0.g gVar, pe0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435129d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435129d;
        this.f435129d = i17 + 1;
        if (i17 == 0) {
            return pe0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
