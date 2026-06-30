package bt;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105632d = 0;

    public o(bt.p pVar, bt.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105632d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105632d;
        this.f105632d = i17 + 1;
        if (i17 == 0) {
            return bt.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
