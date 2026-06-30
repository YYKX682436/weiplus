package dt;

/* loaded from: classes6.dex */
public class n2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324565d = 0;

    public n2(dt.o2 o2Var, dt.m2 m2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324565d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324565d;
        this.f324565d = i17 + 1;
        if (i17 == 0) {
            return dt.j5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
