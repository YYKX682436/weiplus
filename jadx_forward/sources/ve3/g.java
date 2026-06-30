package ve3;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517631d = 0;

    public g(ve3.h hVar, ve3.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517631d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517631d;
        this.f517631d = i17 + 1;
        if (i17 == 0) {
            return we3.f.INSTANCE;
        }
        if (i17 == 1) {
            return xe3.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
