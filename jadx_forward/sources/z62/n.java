package z62;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551881d = 0;

    public n(z62.o oVar, z62.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551881d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551881d;
        this.f551881d = i17 + 1;
        if (i17 == 0) {
            return z62.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
