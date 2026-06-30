package rq1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f480277d = 0;

    public f(rq1.g gVar, rq1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f480277d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f480277d;
        this.f480277d = i17 + 1;
        if (i17 == 0) {
            return rq1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
