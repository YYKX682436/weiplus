package pb1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434694d = 0;

    public r(pb1.s sVar, pb1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434694d;
        this.f434694d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
