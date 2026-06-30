package op0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428760d = 0;

    public f(op0.g gVar, op0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428760d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428760d;
        this.f428760d = i17 + 1;
        if (i17 == 0) {
            return op0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
