package wx2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532109d = 0;

    public b(wx2.c cVar, wx2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532109d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532109d;
        this.f532109d = i17 + 1;
        if (i17 == 0) {
            return wx2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
