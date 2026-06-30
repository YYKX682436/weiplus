package rq3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f480456d = 0;

    public f(rq3.g gVar, rq3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f480456d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f480456d;
        this.f480456d = i17 + 1;
        if (i17 == 0) {
            return rq3.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
