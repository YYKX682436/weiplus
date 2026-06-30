package ql2;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f446031d = 0;

    public b(ql2.c cVar, ql2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f446031d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f446031d;
        this.f446031d = i17 + 1;
        if (i17 == 0) {
            return ql2.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
