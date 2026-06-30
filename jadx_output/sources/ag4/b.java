package ag4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4698d = 0;

    public b(ag4.c cVar, ag4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4698d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4698d;
        this.f4698d = i17 + 1;
        if (i17 == 0) {
            return ag4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
