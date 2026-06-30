package p30;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432978d = 0;

    public e(p30.f fVar, p30.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432978d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432978d;
        this.f432978d = i17 + 1;
        if (i17 == 0) {
            return p30.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
