package c01;

/* loaded from: classes6.dex */
public class c3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118614d = 0;

    public c3(c01.d3 d3Var, c01.b3 b3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118614d;
        this.f118614d = i17 + 1;
        if (i17 == 0) {
            return c01.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
