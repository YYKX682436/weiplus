package xv;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f538885d = 0;

    public f(xv.g gVar, xv.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f538885d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f538885d;
        this.f538885d = i17 + 1;
        if (i17 == 0) {
            return wv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
