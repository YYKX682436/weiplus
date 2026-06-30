package n02;

/* loaded from: classes.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415429d = 0;

    public m(n02.n nVar, n02.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415429d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415429d;
        this.f415429d = i17 + 1;
        if (i17 == 0) {
            return n02.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
