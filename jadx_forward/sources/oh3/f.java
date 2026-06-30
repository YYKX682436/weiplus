package oh3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426964d = 0;

    public f(oh3.g gVar, oh3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426964d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426964d;
        this.f426964d = i17 + 1;
        if (i17 == 0) {
            return oh3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
