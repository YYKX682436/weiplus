package ar0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13361d = 0;

    public f(ar0.g gVar, ar0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13361d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13361d;
        this.f13361d = i17 + 1;
        if (i17 == 0) {
            return ar0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
