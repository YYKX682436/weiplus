package yq;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f545944d = 0;

    public b(yq.c cVar, yq.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f545944d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f545944d;
        this.f545944d = i17 + 1;
        if (i17 == 0) {
            return yq.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
