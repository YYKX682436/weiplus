package rk4;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f478566d = 0;

    public w(rk4.x xVar, rk4.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f478566d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f478566d;
        this.f478566d = i17 + 1;
        if (i17 == 0) {
            return rk4.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
