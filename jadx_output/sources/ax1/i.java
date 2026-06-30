package ax1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f14999d = 0;

    public i(ax1.j jVar, ax1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14999d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f14999d;
        this.f14999d = i17 + 1;
        if (i17 == 0) {
            return ax1.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
