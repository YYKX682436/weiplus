package lh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400177d = 0;

    public f(lh0.g gVar, lh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400177d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400177d;
        this.f400177d = i17 + 1;
        if (i17 == 0) {
            return lh0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
