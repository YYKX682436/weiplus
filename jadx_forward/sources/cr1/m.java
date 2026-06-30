package cr1;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303382d = 0;

    public m(cr1.n nVar, cr1.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303382d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303382d;
        this.f303382d = i17 + 1;
        if (i17 == 0) {
            return cr1.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
