package gb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351478d = 0;

    public b(gb0.c cVar, gb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351478d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351478d;
        this.f351478d = i17 + 1;
        if (i17 == 0) {
            return gb0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
