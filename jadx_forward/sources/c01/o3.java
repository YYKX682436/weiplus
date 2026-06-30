package c01;

/* loaded from: classes6.dex */
public class o3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118893d = 0;

    public o3(c01.p3 p3Var, c01.n3 n3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118893d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118893d;
        this.f118893d = i17 + 1;
        if (i17 == 0) {
            return c01.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
