package et;

/* loaded from: classes6.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338048d = 0;

    public v1(et.w1 w1Var, et.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338048d;
        this.f338048d = i17 + 1;
        if (i17 == 0) {
            return et.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
