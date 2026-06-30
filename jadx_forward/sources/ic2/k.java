package ic2;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371868d = 0;

    public k(ic2.l lVar, ic2.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371868d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371868d;
        this.f371868d = i17 + 1;
        if (i17 == 0) {
            return ic2.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
