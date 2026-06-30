package c01;

/* loaded from: classes6.dex */
public class m4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118859d = 0;

    public m4(c01.n4 n4Var, c01.l4 l4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118859d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118859d;
        this.f118859d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p943x351df9c2.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
