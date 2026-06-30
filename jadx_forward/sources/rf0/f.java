package rf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f476143d = 0;

    public f(rf0.g gVar, rf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f476143d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f476143d;
        this.f476143d = i17 + 1;
        if (i17 == 0) {
            return qf0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
