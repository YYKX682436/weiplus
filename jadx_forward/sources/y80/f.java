package y80;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541373d = 0;

    public f(y80.g gVar, y80.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541373d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541373d;
        this.f541373d = i17 + 1;
        if (i17 == 0) {
            return y80.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
