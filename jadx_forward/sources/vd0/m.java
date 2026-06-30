package vd0;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516996d = 0;

    public m(vd0.n nVar, vd0.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516996d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516996d;
        this.f516996d = i17 + 1;
        if (i17 == 0) {
            return vd0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
