package ct;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303691d = 0;

    public h2(ct.i2 i2Var, ct.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303691d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303691d;
        this.f303691d = i17 + 1;
        if (i17 == 0) {
            return qg5.a3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
