package oh1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426744d = 0;

    public f(oh1.g gVar, oh1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426744d;
        this.f426744d = i17 + 1;
        if (i17 == 0) {
            return oh1.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
