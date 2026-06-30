package j41;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379161d = 0;

    public f(j41.g gVar, j41.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379161d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379161d;
        this.f379161d = i17 + 1;
        if (i17 == 0) {
            return l41.d2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
