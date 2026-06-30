package zb0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552776d = 0;

    public j(zb0.k kVar, zb0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552776d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552776d;
        this.f552776d = i17 + 1;
        if (i17 == 0) {
            return yb0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
