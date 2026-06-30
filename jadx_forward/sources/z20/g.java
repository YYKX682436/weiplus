package z20;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551080d = 0;

    public g(z20.h hVar, z20.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551080d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551080d;
        this.f551080d = i17 + 1;
        if (i17 == 0) {
            return z20.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
