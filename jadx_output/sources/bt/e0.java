package bt;

/* loaded from: classes6.dex */
public class e0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24073d = 0;

    public e0(bt.f0 f0Var, bt.d0 d0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24073d;
        this.f24073d = i17 + 1;
        if (i17 == 0) {
            return bt.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
