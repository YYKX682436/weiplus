package dt;

/* loaded from: classes6.dex */
public class t3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324609d = 0;

    public t3(dt.u3 u3Var, dt.s3 s3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324609d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324609d;
        this.f324609d = i17 + 1;
        if (i17 == 0) {
            return dt.h6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
