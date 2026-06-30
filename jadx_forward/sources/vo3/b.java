package vo3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f520093d = 0;

    public b(vo3.c cVar, vo3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f520093d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f520093d;
        this.f520093d = i17 + 1;
        if (i17 == 0) {
            return vo3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
