package z60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551848d = 0;

    public f(z60.g gVar, z60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551848d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551848d;
        this.f551848d = i17 + 1;
        if (i17 == 0) {
            return z60.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
