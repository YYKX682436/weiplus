package g42;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350270d = 0;

    public k(g42.l lVar, g42.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350270d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350270d;
        this.f350270d = i17 + 1;
        if (i17 == 0) {
            return g42.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
