package ax1;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f15006d = 0;

    public m(ax1.n nVar, ax1.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f15006d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f15006d;
        this.f15006d = i17 + 1;
        if (i17 == 0) {
            return ax1.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
