package ms;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412452d = 0;

    public e(ms.f fVar, ms.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412452d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412452d;
        this.f412452d = i17 + 1;
        if (i17 == 0) {
            return ms.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
