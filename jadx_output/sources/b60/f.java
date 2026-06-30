package b60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18128d = 0;

    public f(b60.g gVar, b60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18128d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18128d;
        this.f18128d = i17 + 1;
        if (i17 == 0) {
            return b60.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
