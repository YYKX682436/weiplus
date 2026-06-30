package z80;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552177d = 0;

    public f(z80.g gVar, z80.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552177d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552177d;
        this.f552177d = i17 + 1;
        if (i17 == 0) {
            return y80.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
