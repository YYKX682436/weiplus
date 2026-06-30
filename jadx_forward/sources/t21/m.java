package t21;

/* loaded from: classes.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496366d = 0;

    public m(t21.n nVar, t21.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496366d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496366d;
        this.f496366d = i17 + 1;
        if (i17 == 0) {
            return di3.c0.INSTANCE;
        }
        if (i17 == 1) {
            return t21.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
