package c01;

/* loaded from: classes6.dex */
public class w3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37532d = 0;

    public w3(c01.x3 x3Var, c01.v3 v3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37532d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37532d;
        this.f37532d = i17 + 1;
        if (i17 == 0) {
            return c01.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
