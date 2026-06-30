package bh0;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f20796d = 0;

    public i(bh0.j jVar, bh0.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20796d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f20796d;
        this.f20796d = i17 + 1;
        if (i17 == 0) {
            return bh0.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
