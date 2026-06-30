package sq0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492863d = 0;

    public b(sq0.c cVar, sq0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492863d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492863d;
        this.f492863d = i17 + 1;
        if (i17 == 0) {
            return sq0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
