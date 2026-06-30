package a41;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82718d = 0;

    public f(a41.g gVar, a41.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82718d;
        this.f82718d = i17 + 1;
        if (i17 == 0) {
            return a41.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
