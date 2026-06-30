package bd0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19226d = 0;

    public j(bd0.k kVar, bd0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19226d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19226d;
        this.f19226d = i17 + 1;
        if (i17 == 0) {
            return bd0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
