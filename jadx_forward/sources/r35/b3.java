package r35;

/* loaded from: classes6.dex */
public class b3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450584d = 0;

    public b3(r35.c3 c3Var, r35.a3 a3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450584d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450584d;
        this.f450584d = i17 + 1;
        if (i17 == 0) {
            return r35.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
