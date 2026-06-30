package ax1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f14994d = 0;

    public e(ax1.f fVar, ax1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14994d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f14994d;
        this.f14994d = i17 + 1;
        if (i17 == 0) {
            return ax1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
