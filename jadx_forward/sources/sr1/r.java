package sr1;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493018d = 0;

    public r(sr1.s sVar, sr1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493018d;
        this.f493018d = i17 + 1;
        if (i17 == 0) {
            return sr1.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
