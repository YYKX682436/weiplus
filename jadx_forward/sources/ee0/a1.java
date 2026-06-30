package ee0;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332946d = 0;

    public a1(ee0.b1 b1Var, ee0.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332946d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332946d;
        this.f332946d = i17 + 1;
        if (i17 == 0) {
            return ee0.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
