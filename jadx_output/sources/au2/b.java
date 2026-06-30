package au2;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f14064d = 0;

    public b(au2.c cVar, au2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14064d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f14064d;
        this.f14064d = i17 + 1;
        if (i17 == 0) {
            return au2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
