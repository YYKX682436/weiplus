package e70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331376d = 0;

    public b(e70.c cVar, e70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331376d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331376d;
        this.f331376d = i17 + 1;
        if (i17 == 0) {
            return u71.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
