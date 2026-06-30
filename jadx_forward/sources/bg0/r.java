package bg0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101395d = 0;

    public r(bg0.s sVar, bg0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101395d;
        this.f101395d = i17 + 1;
        if (i17 == 0) {
            return b92.a3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
