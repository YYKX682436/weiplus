package i35;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369852d = 0;

    public b(i35.c cVar, i35.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369852d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369852d;
        this.f369852d = i17 + 1;
        if (i17 == 0) {
            return m73.n.INSTANCE;
        }
        if (i17 == 1) {
            return zh4.r.INSTANCE;
        }
        if (i17 == 2) {
            return yh0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
