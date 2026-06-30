package v40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514709d = 0;

    public b(v40.c cVar, v40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514709d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514709d;
        this.f514709d = i17 + 1;
        if (i17 == 0) {
            return v40.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
