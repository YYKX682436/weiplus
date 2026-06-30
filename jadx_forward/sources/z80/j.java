package z80;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552182d = 0;

    public j(z80.k kVar, z80.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552182d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552182d;
        this.f552182d = i17 + 1;
        if (i17 == 0) {
            return y80.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
