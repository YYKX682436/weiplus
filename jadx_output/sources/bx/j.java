package bx;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36222d = 0;

    public j(bx.k kVar, bx.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36222d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36222d;
        this.f36222d = i17 + 1;
        if (i17 == 0) {
            return cx.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
