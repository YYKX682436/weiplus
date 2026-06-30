package rv;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481362d = 0;

    public c1(rv.d1 d1Var, rv.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481362d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481362d;
        this.f481362d = i17 + 1;
        if (i17 == 0) {
            return vw.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
