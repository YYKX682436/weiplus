package at3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13792d = 0;

    public e(at3.f fVar, at3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13792d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13792d;
        this.f13792d = i17 + 1;
        if (i17 == 0) {
            return at3.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
