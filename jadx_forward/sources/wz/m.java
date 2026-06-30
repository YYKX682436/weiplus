package wz;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532224d = 0;

    public m(wz.n nVar, wz.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532224d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532224d;
        this.f532224d = i17 + 1;
        if (i17 == 0) {
            return wz.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
