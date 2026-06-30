package ve3;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517634d = 0;

    public k(ve3.l lVar, ve3.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517634d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517634d;
        this.f517634d = i17 + 1;
        if (i17 == 0) {
            return xe3.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
