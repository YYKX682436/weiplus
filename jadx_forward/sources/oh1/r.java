package oh1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426813d = 0;

    public r(oh1.s sVar, oh1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426813d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426813d;
        this.f426813d = i17 + 1;
        if (i17 == 0) {
            return oh1.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
