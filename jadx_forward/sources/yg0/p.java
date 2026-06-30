package yg0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543773d = 0;

    public p(yg0.q qVar, yg0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543773d;
        this.f543773d = i17 + 1;
        if (i17 == 0) {
            return yg0.v2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
