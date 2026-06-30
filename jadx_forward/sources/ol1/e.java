package ol1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427660d = 0;

    public e(ol1.f fVar, ol1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427660d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427660d;
        this.f427660d = i17 + 1;
        if (i17 == 0) {
            return ol1.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
