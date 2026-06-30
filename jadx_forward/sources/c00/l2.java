package c00;

/* loaded from: classes6.dex */
public class l2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118532d = 0;

    public l2(c00.m2 m2Var, c00.k2 k2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118532d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118532d;
        this.f118532d = i17 + 1;
        if (i17 == 0) {
            return b00.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
