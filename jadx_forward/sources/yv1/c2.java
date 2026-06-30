package yv1;

/* loaded from: classes6.dex */
public class c2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547542d = 0;

    public c2(yv1.d2 d2Var, yv1.b2 b2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547542d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547542d;
        this.f547542d = i17 + 1;
        if (i17 == 0) {
            return yv1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
