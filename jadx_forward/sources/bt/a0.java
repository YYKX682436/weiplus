package bt;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105592d = 0;

    public a0(bt.b0 b0Var, bt.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105592d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105592d;
        this.f105592d = i17 + 1;
        if (i17 == 0) {
            return bt.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
