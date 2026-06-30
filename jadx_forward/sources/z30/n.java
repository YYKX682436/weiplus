package z30;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551402d = 0;

    public n(z30.o oVar, z30.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551402d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551402d;
        this.f551402d = i17 + 1;
        if (i17 == 0) {
            return y30.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
