package ct;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303715d = 0;

    public r(ct.s sVar, ct.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303715d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303715d;
        this.f303715d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
