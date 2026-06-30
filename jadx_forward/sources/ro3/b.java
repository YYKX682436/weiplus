package ro3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f479641d = 0;

    public b(ro3.c cVar, ro3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f479641d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f479641d;
        this.f479641d = i17 + 1;
        if (i17 == 0) {
            return ro3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
