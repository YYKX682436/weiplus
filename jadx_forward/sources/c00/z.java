package c00;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118570d = 0;

    public z(c00.a0 a0Var, c00.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118570d;
        this.f118570d = i17 + 1;
        if (i17 == 0) {
            return j00.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
