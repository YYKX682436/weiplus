package ut1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f512339d = 0;

    public e(ut1.f fVar, ut1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f512339d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f512339d;
        this.f512339d = i17 + 1;
        if (i17 == 0) {
            return ut1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
