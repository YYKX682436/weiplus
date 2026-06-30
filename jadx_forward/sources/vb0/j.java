package vb0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516000d = 0;

    public j(vb0.k kVar, vb0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516000d;
        this.f516000d = i17 + 1;
        if (i17 == 0) {
            return ub0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
