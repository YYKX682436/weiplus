package qi3;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445291d = 0;

    public t(qi3.u uVar, qi3.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445291d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445291d;
        this.f445291d = i17 + 1;
        if (i17 == 0) {
            return jm.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
