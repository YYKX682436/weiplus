package ci5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41719d = 0;

    public b(ci5.c cVar, ci5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41719d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41719d;
        this.f41719d = i17 + 1;
        if (i17 == 0) {
            return ci5.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
