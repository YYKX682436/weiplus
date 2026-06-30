package fe0;

/* loaded from: classes6.dex */
public class e0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342916d = 0;

    public e0(fe0.f0 f0Var, fe0.d0 d0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342916d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342916d;
        this.f342916d = i17 + 1;
        if (i17 == 0) {
            return ee0.q3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
