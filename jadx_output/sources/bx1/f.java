package bx1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36300d = 0;

    public f(bx1.g gVar, bx1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36300d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36300d;
        this.f36300d = i17 + 1;
        if (i17 == 0) {
            return ax1.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
