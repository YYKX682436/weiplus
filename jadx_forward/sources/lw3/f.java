package lw3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403160d = 0;

    public f(lw3.g gVar, lw3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403160d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403160d;
        this.f403160d = i17 + 1;
        if (i17 == 0) {
            return lw3.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
