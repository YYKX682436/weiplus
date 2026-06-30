package c01;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37198d = 0;

    public g3(c01.h3 h3Var, c01.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37198d;
        this.f37198d = i17 + 1;
        if (i17 == 0) {
            return c01.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
