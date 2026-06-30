package x61;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533740d = 0;

    public j(x61.k kVar, x61.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533740d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533740d;
        this.f533740d = i17 + 1;
        if (i17 == 0) {
            return x61.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
