package zy2;

/* loaded from: classes6.dex */
public class k4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558967d = 0;

    public k4(zy2.l4 l4Var, zy2.j4 j4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558967d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558967d;
        this.f558967d = i17 + 1;
        if (i17 == 0) {
            return wn2.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
