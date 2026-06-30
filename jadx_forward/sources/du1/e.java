package du1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324997d = 0;

    public e(du1.f fVar, du1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324997d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324997d;
        this.f324997d = i17 + 1;
        if (i17 == 0) {
            return du1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
