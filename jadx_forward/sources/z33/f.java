package z33;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551498d = 0;

    public f(z33.g gVar, z33.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551498d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551498d;
        this.f551498d = i17 + 1;
        if (i17 == 0) {
            return z33.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
