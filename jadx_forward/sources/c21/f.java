package c21;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119522d = 0;

    public f(c21.g gVar, c21.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119522d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119522d;
        this.f119522d = i17 + 1;
        if (i17 == 0) {
            return ll3.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
