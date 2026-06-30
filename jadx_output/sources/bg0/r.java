package bg0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19862d = 0;

    public r(bg0.s sVar, bg0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19862d;
        this.f19862d = i17 + 1;
        if (i17 == 0) {
            return b92.a3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
