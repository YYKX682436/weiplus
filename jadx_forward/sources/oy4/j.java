package oy4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431603d = 0;

    public j(oy4.k kVar, oy4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431603d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431603d;
        this.f431603d = i17 + 1;
        if (i17 == 0) {
            return oy4.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
