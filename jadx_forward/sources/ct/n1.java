package ct;

/* loaded from: classes6.dex */
public class n1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303707d = 0;

    public n1(ct.o1 o1Var, ct.m1 m1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303707d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303707d;
        this.f303707d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
