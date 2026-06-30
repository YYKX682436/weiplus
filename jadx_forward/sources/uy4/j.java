package uy4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513545d = 0;

    public j(uy4.k kVar, uy4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513545d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513545d;
        this.f513545d = i17 + 1;
        if (i17 == 0) {
            return az4.c.INSTANCE;
        }
        if (i17 == 1) {
            return wy4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
