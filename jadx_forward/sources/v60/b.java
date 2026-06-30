package v60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514923d = 0;

    public b(v60.c cVar, v60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514923d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514923d;
        this.f514923d = i17 + 1;
        if (i17 == 0) {
            return v60.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
