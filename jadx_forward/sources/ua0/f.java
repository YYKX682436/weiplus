package ua0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f507436d = 0;

    public f(ua0.g gVar, ua0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f507436d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f507436d;
        this.f507436d = i17 + 1;
        if (i17 == 0) {
            return ua0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
