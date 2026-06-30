package q91;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442424d = 0;

    public g(q91.h hVar, q91.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442424d;
        this.f442424d = i17 + 1;
        if (i17 == 0) {
            return q91.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
