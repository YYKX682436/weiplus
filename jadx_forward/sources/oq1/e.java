package oq1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428868d = 0;

    public e(oq1.f fVar, oq1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428868d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428868d;
        this.f428868d = i17 + 1;
        if (i17 == 0) {
            return nq1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
