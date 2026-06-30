package cc0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f40415d = 0;

    public g(cc0.h hVar, cc0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40415d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f40415d;
        this.f40415d = i17 + 1;
        if (i17 == 0) {
            return rq3.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
