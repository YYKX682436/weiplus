package zy2;

/* loaded from: classes6.dex */
public class a3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558877d = 0;

    public a3(zy2.b3 b3Var, zy2.z2 z2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558877d;
        this.f558877d = i17 + 1;
        if (i17 == 0) {
            return c61.x8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
