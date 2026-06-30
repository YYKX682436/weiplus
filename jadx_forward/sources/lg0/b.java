package lg0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400068d = 0;

    public b(lg0.c cVar, lg0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400068d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400068d;
        this.f400068d = i17 + 1;
        if (i17 == 0) {
            return kg0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
