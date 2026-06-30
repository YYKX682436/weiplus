package ee0;

/* loaded from: classes6.dex */
public class e3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332976d = 0;

    public e3(ee0.f3 f3Var, ee0.d3 d3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332976d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332976d;
        this.f332976d = i17 + 1;
        if (i17 == 0) {
            return ee0.w4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
