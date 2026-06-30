package xv4;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f538964d = 0;

    public b(xv4.c cVar, xv4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f538964d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f538964d;
        this.f538964d = i17 + 1;
        if (i17 == 0) {
            return xv4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
