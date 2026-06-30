package t23;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496678d = 0;

    public f0(t23.g0 g0Var, t23.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496678d;
        this.f496678d = i17 + 1;
        if (i17 == 0) {
            return t23.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
