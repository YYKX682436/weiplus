package fo3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346434d = 0;

    public e(fo3.f fVar, fo3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346434d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346434d;
        this.f346434d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
