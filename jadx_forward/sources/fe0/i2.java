package fe0;

/* loaded from: classes6.dex */
public class i2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342934d = 0;

    public i2(fe0.j2 j2Var, fe0.h2 h2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342934d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342934d;
        this.f342934d = i17 + 1;
        if (i17 == 0) {
            return ee0.q4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
