package bt;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105648d = 0;

    public s(bt.t tVar, bt.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105648d;
        this.f105648d = i17 + 1;
        if (i17 == 0) {
            return bt.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
