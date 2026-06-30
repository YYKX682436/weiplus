package c61;

/* loaded from: classes6.dex */
public class g1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38988d = 0;

    public g1(c61.h1 h1Var, c61.f1 f1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38988d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38988d;
        this.f38988d = i17 + 1;
        if (i17 == 0) {
            return b92.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
