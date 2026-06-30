package dd0;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f310441d = 0;

    public d0(dd0.e0 e0Var, dd0.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f310441d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f310441d;
        this.f310441d = i17 + 1;
        if (i17 == 0) {
            return dd0.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
