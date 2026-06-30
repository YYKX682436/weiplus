package v62;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515062d = 0;

    public r(v62.s sVar, v62.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515062d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515062d;
        this.f515062d = i17 + 1;
        if (i17 == 0) {
            return v62.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
