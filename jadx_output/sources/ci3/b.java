package ci3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41701d = 0;

    public b(ci3.c cVar, ci3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41701d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41701d;
        this.f41701d = i17 + 1;
        if (i17 == 0) {
            return ci3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
