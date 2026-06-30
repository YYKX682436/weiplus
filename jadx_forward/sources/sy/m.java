package sy;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495347d = 0;

    public m(sy.n nVar, sy.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495347d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495347d;
        this.f495347d = i17 + 1;
        if (i17 == 0) {
            return sy.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
