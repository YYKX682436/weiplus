package pg3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435736d = 0;

    public f(pg3.g gVar, pg3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435736d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435736d;
        this.f435736d = i17 + 1;
        if (i17 == 0) {
            return pg3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
