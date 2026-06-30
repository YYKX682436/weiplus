package c40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119889d = 0;

    public f(c40.g gVar, c40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119889d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119889d;
        this.f119889d = i17 + 1;
        if (i17 == 0) {
            return c40.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
