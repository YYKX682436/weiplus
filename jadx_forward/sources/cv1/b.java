package cv1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304083d = 0;

    public b(cv1.c cVar, cv1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304083d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304083d;
        this.f304083d = i17 + 1;
        if (i17 == 0) {
            return cv1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
