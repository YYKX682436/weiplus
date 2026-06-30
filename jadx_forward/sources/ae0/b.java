package ae0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f84905d = 0;

    public b(ae0.c cVar, ae0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84905d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f84905d;
        this.f84905d = i17 + 1;
        if (i17 == 0) {
            return zd0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
