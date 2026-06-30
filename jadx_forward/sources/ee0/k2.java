package ee0;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333011d = 0;

    public k2(ee0.l2 l2Var, ee0.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333011d;
        this.f333011d = i17 + 1;
        if (i17 == 0) {
            return ee0.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
