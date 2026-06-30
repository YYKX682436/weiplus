package bv;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24663d = 0;

    public m(bv.n nVar, bv.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24663d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24663d;
        this.f24663d = i17 + 1;
        if (i17 == 0) {
            return bv.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
