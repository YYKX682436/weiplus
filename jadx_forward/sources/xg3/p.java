package xg3;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f535953d = 0;

    public p(xg3.q qVar, xg3.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f535953d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f535953d;
        this.f535953d = i17 + 1;
        if (i17 == 0) {
            return ce0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
