package c63;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39467d = 0;

    public f(c63.g gVar, c63.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39467d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39467d;
        this.f39467d = i17 + 1;
        if (i17 == 0) {
            return c63.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
