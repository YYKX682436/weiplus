package u50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506292d = 0;

    public f(u50.g gVar, u50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506292d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506292d;
        this.f506292d = i17 + 1;
        if (i17 == 0) {
            return s50.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
