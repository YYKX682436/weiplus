package nr1;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420690d = 0;

    public m(nr1.n nVar, nr1.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420690d;
        this.f420690d = i17 + 1;
        if (i17 == 0) {
            return nr1.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
