package pt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439703d = 0;

    public j(pt.k kVar, pt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439703d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439703d;
        this.f439703d = i17 + 1;
        if (i17 == 0) {
            return ot.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
