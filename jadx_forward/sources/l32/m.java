package l32;

/* loaded from: classes.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f396947d = 0;

    public m(l32.n nVar, l32.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396947d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f396947d;
        this.f396947d = i17 + 1;
        if (i17 == 0) {
            return l32.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
