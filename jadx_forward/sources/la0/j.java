package la0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399010d = 0;

    public j(la0.k kVar, la0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399010d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399010d;
        this.f399010d = i17 + 1;
        if (i17 == 0) {
            return la0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
