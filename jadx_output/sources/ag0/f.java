package ag0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4674d = 0;

    public f(ag0.g gVar, ag0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4674d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4674d;
        this.f4674d = i17 + 1;
        if (i17 == 0) {
            return ag0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
