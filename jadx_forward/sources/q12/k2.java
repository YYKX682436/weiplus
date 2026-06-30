package q12;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441135d = 0;

    public k2(q12.l2 l2Var, q12.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441135d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441135d;
        this.f441135d = i17 + 1;
        if (i17 == 0) {
            return q12.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
