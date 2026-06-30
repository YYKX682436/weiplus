package ie0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f372491d = 0;

    public f(ie0.g gVar, ie0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f372491d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f372491d;
        this.f372491d = i17 + 1;
        if (i17 == 0) {
            return ie0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
