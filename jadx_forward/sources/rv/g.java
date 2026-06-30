package rv;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481379d = 0;

    public g(rv.h hVar, rv.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481379d;
        this.f481379d = i17 + 1;
        if (i17 == 0) {
            return qv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
