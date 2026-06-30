package c01;

/* loaded from: classes6.dex */
public class i4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118781d = 0;

    public i4(c01.j4 j4Var, c01.h4 h4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118781d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118781d;
        this.f118781d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
