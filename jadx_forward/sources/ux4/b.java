package ux4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513408d = 0;

    public b(ux4.c cVar, ux4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513408d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513408d;
        this.f513408d = i17 + 1;
        if (i17 == 0) {
            return ux4.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
