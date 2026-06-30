package mf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407529d = 0;

    public b(mf0.c cVar, mf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407529d;
        this.f407529d = i17 + 1;
        if (i17 == 0) {
            return lf0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
