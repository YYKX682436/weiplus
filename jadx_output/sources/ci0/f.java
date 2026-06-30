package ci0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41651d = 0;

    public f(ci0.g gVar, ci0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41651d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41651d;
        this.f41651d = i17 + 1;
        if (i17 == 0) {
            return pc0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
