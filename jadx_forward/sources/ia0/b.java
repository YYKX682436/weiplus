package ia0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371416d = 0;

    public b(ia0.c cVar, ia0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371416d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371416d;
        this.f371416d = i17 + 1;
        if (i17 == 0) {
            return vd0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
