package bh0;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102363d = 0;

    public u(bh0.v vVar, bh0.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102363d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102363d;
        this.f102363d = i17 + 1;
        if (i17 == 0) {
            return bh0.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
