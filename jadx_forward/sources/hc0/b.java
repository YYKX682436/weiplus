package hc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361806d = 0;

    public b(hc0.c cVar, hc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361806d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361806d;
        this.f361806d = i17 + 1;
        if (i17 == 0) {
            return hc0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
