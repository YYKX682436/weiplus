package rj1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477699d = 0;

    public e(rj1.f fVar, rj1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477699d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477699d;
        this.f477699d = i17 + 1;
        if (i17 == 0) {
            return rj1.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
