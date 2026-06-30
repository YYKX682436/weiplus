package en0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336775d = 0;

    public b(en0.c cVar, en0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336775d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336775d;
        this.f336775d = i17 + 1;
        if (i17 == 0) {
            return vd2.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
