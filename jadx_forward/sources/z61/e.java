package z61;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551862d = 0;

    public e(z61.f fVar, z61.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551862d;
        this.f551862d = i17 + 1;
        if (i17 == 0) {
            return b71.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
