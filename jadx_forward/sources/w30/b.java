package w30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f524192d = 0;

    public b(w30.c cVar, w30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f524192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f524192d;
        this.f524192d = i17 + 1;
        if (i17 == 0) {
            return w30.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
