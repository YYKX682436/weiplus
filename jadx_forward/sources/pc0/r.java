package pc0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434834d = 0;

    public r(pc0.s sVar, pc0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434834d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434834d;
        this.f434834d = i17 + 1;
        if (i17 == 0) {
            return pc0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
