package z40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551614d = 0;

    public b(z40.c cVar, z40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551614d;
        this.f551614d = i17 + 1;
        if (i17 == 0) {
            return y40.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
