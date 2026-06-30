package sg0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f489305d = 0;

    public p(sg0.q qVar, sg0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f489305d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f489305d;
        this.f489305d = i17 + 1;
        if (i17 == 0) {
            return sg0.d2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
