package m80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406215d = 0;

    public b(m80.c cVar, m80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406215d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406215d;
        this.f406215d = i17 + 1;
        if (i17 == 0) {
            return l80.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
