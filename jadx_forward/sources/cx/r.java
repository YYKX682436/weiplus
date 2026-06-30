package cx;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305989d = 0;

    public r(cx.s sVar, cx.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305989d;
        this.f305989d = i17 + 1;
        if (i17 == 0) {
            return cx.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
