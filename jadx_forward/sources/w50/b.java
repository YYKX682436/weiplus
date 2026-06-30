package w50;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f524479d = 0;

    public b(w50.c cVar, w50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f524479d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f524479d;
        this.f524479d = i17 + 1;
        if (i17 == 0) {
            return w50.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
