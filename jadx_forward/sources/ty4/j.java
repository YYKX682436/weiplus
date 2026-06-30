package ty4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f504674d = 0;

    public j(ty4.k kVar, ty4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f504674d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f504674d;
        this.f504674d = i17 + 1;
        if (i17 == 0) {
            return ty4.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
