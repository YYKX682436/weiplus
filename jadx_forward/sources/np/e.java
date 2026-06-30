package np;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420316d = 0;

    public e(np.f fVar, np.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420316d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420316d;
        this.f420316d = i17 + 1;
        if (i17 == 0) {
            return np.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
