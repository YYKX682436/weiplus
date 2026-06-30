package c00;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36981d = 0;

    public h2(c00.i2 i2Var, c00.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36981d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36981d;
        this.f36981d = i17 + 1;
        if (i17 == 0) {
            return b00.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
