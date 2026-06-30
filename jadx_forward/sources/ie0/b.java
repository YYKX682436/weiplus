package ie0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f372488d = 0;

    public b(ie0.c cVar, ie0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f372488d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f372488d;
        this.f372488d = i17 + 1;
        if (i17 == 0) {
            return ie0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
