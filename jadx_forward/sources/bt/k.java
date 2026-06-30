package bt;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105622d = 0;

    public k(bt.l lVar, bt.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105622d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105622d;
        this.f105622d = i17 + 1;
        if (i17 == 0) {
            return bt.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
