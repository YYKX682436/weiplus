package da5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f309333d = 0;

    public b(da5.c cVar, da5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f309333d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f309333d;
        this.f309333d = i17 + 1;
        if (i17 == 0) {
            return da5.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
