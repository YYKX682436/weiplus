package j41;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379191d = 0;

    public r(j41.s sVar, j41.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379191d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379191d;
        this.f379191d = i17 + 1;
        if (i17 == 0) {
            return i41.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
