package pg2;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435635d = 0;

    public f(pg2.g gVar, pg2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435635d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435635d;
        this.f435635d = i17 + 1;
        if (i17 == 0) {
            return pg2.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
