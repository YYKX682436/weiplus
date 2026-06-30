package c01;

/* loaded from: classes6.dex */
public class w5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37535d = 0;

    public w5(c01.x5 x5Var, c01.v5 v5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37535d;
        this.f37535d = i17 + 1;
        if (i17 == 0) {
            return c01.db.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
