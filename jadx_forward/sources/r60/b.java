package r60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474311d = 0;

    public b(r60.c cVar, r60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474311d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474311d;
        this.f474311d = i17 + 1;
        if (i17 == 0) {
            return r60.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
