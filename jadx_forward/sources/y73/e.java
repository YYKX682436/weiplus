package y73;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541250d = 0;

    public e(y73.f fVar, y73.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541250d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541250d;
        this.f541250d = i17 + 1;
        if (i17 == 0) {
            return y73.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
