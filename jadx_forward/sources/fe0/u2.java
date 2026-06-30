package fe0;

/* loaded from: classes6.dex */
public class u2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342981d = 0;

    public u2(fe0.v2 v2Var, fe0.t2 t2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342981d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342981d;
        this.f342981d = i17 + 1;
        if (i17 == 0) {
            return ee0.w4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
