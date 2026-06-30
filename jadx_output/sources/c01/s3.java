package c01;

/* loaded from: classes6.dex */
public class s3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37450d = 0;

    public s3(c01.t3 t3Var, c01.r3 r3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37450d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37450d;
        this.f37450d = i17 + 1;
        if (i17 == 0) {
            return c01.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
