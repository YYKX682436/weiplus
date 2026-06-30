package b93;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18590d = 0;

    public e(b93.f fVar, b93.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18590d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18590d;
        this.f18590d = i17 + 1;
        if (i17 == 0) {
            return b93.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
