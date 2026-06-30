package g61;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350604d = 0;

    public y(g61.z zVar, g61.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350604d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350604d;
        this.f350604d = i17 + 1;
        if (i17 == 0) {
            return g61.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
