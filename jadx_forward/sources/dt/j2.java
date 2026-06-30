package dt;

/* loaded from: classes6.dex */
public class j2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324537d = 0;

    public j2(dt.k2 k2Var, dt.i2 i2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324537d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324537d;
        this.f324537d = i17 + 1;
        if (i17 == 0) {
            return dt.g5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
