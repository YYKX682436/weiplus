package dt;

/* loaded from: classes6.dex */
public class h3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324522d = 0;

    public h3(dt.i3 i3Var, dt.g3 g3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324522d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324522d;
        this.f324522d = i17 + 1;
        if (i17 == 0) {
            return dt.y5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
