package cl3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f124465d = 0;

    public b(cl3.c cVar, cl3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124465d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f124465d;
        this.f124465d = i17 + 1;
        if (i17 == 0) {
            return ll3.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
