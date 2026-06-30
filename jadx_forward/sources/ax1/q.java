package ax1;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f96542d = 0;

    public q(ax1.r rVar, ax1.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96542d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f96542d;
        this.f96542d = i17 + 1;
        if (i17 == 0) {
            return ax1.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
