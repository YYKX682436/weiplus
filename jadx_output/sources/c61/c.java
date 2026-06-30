package c61;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38907d = 0;

    public c(c61.d dVar, c61.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38907d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38907d;
        this.f38907d = i17 + 1;
        if (i17 == 0) {
            return c61.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
