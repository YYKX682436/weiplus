package g62;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350613d = 0;

    public e(g62.f fVar, g62.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350613d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350613d;
        this.f350613d = i17 + 1;
        if (i17 == 0) {
            return g62.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
