package fe0;

/* loaded from: classes6.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342919d = 0;

    public e2(fe0.f2 f2Var, fe0.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342919d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342919d;
        this.f342919d = i17 + 1;
        if (i17 == 0) {
            return ee0.o4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
