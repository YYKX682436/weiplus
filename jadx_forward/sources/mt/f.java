package mt;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412700d = 0;

    public f(mt.g gVar, mt.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412700d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412700d;
        this.f412700d = i17 + 1;
        if (i17 == 0) {
            return mt.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
