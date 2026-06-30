package on4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428640d = 0;

    public f(on4.g gVar, on4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428640d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428640d;
        this.f428640d = i17 + 1;
        if (i17 == 0) {
            return on4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
