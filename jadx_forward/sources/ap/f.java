package ap;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94122d = 0;

    public f(ap.g gVar, ap.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94122d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94122d;
        this.f94122d = i17 + 1;
        if (i17 == 0) {
            return hr0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
