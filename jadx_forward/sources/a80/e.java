package a80;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f83486d = 0;

    public e(a80.f fVar, a80.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f83486d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f83486d;
        this.f83486d = i17 + 1;
        if (i17 == 0) {
            return a80.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
