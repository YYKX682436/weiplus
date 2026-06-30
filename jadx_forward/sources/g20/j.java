package g20;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349314d = 0;

    public j(g20.k kVar, g20.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349314d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349314d;
        this.f349314d = i17 + 1;
        if (i17 == 0) {
            return g20.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
