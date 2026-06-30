package rv;

/* loaded from: classes6.dex */
public class w1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481442d = 0;

    public w1(rv.x1 x1Var, rv.v1 v1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481442d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481442d;
        this.f481442d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
