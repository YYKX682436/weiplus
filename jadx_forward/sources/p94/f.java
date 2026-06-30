package p94;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434433d = 0;

    public f(p94.g gVar, p94.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434433d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434433d;
        this.f434433d = i17 + 1;
        if (i17 == 0) {
            return n34.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
