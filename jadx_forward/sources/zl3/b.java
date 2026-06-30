package zl3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f555587d = 0;

    public b(zl3.c cVar, zl3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f555587d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f555587d;
        this.f555587d = i17 + 1;
        if (i17 == 0) {
            return zl3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
