package ee0;

/* loaded from: classes6.dex */
public class a3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332949d = 0;

    public a3(ee0.b3 b3Var, ee0.z2 z2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332949d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332949d;
        this.f332949d = i17 + 1;
        if (i17 == 0) {
            return ee0.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
