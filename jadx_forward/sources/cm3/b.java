package cm3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f124943d = 0;

    public b(cm3.c cVar, cm3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f124943d;
        this.f124943d = i17 + 1;
        if (i17 == 0) {
            return cm3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
