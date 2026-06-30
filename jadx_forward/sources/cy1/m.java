package cy1;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306266d = 0;

    public m(cy1.n nVar, cy1.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306266d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306266d;
        this.f306266d = i17 + 1;
        if (i17 == 0) {
            return cy1.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
