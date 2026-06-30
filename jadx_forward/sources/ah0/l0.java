package ah0;

/* loaded from: classes.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f86294d = 0;

    public l0(ah0.m0 m0Var, ah0.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86294d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f86294d;
        this.f86294d = i17 + 1;
        if (i17 == 0) {
            return ah0.e2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
