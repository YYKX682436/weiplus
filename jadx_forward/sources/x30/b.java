package x30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533129d = 0;

    public b(x30.c cVar, x30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533129d < 9;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533129d;
        this.f533129d = i17 + 1;
        switch (i17) {
            case 0:
                return o60.m.INSTANCE;
            case 1:
                return f01.c.INSTANCE;
            case 2:
                return sv.c.INSTANCE;
            case 3:
                return f01.i.INSTANCE;
            case 4:
                return f01.f.INSTANCE;
            case 5:
                return ye0.f.INSTANCE;
            case 6:
                return z62.x.INSTANCE;
            case 7:
                return hr1.l.INSTANCE;
            case 8:
                return nr1.i.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 9");
        }
    }
}
