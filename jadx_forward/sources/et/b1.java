package et;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337972d = 0;

    public b1(et.c1 c1Var, et.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337972d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337972d;
        this.f337972d = i17 + 1;
        if (i17 == 0) {
            return et.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
