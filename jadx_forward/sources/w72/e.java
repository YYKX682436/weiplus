package w72;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f525014d = 0;

    public e(w72.f fVar, w72.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f525014d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f525014d;
        this.f525014d = i17 + 1;
        if (i17 == 0) {
            return w72.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
