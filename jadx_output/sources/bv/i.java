package bv;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24652d = 0;

    public i(bv.j jVar, bv.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24652d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24652d;
        this.f24652d = i17 + 1;
        if (i17 == 0) {
            return bv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
