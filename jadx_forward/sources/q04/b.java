package q04;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440902d = 0;

    public b(q04.c cVar, q04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440902d;
        this.f440902d = i17 + 1;
        if (i17 == 0) {
            return q04.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
