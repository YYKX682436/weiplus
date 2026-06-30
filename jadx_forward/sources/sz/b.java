package sz;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495438d = 0;

    public b(sz.c cVar, sz.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495438d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495438d;
        this.f495438d = i17 + 1;
        if (i17 == 0) {
            return sz.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
