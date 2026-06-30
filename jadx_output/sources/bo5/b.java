package bo5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f23026d = 0;

    public b(bo5.c cVar, bo5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23026d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f23026d;
        this.f23026d = i17 + 1;
        if (i17 == 0) {
            return ao5.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
