package dt;

/* loaded from: classes6.dex */
public class p3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324581d = 0;

    public p3(dt.q3 q3Var, dt.o3 o3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324581d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324581d;
        this.f324581d = i17 + 1;
        if (i17 == 0) {
            return dt.e6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
