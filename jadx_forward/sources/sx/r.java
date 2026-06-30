package sx;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495040d = 0;

    public r(sx.s sVar, sx.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495040d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495040d;
        this.f495040d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p947xba6de98f.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
