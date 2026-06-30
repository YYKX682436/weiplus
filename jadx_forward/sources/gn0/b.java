package gn0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f355105d = 0;

    public b(gn0.c cVar, gn0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f355105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f355105d;
        this.f355105d = i17 + 1;
        if (i17 == 0) {
            return fn0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
