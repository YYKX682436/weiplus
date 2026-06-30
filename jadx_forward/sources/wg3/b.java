package wg3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f527257d = 0;

    public b(wg3.c cVar, wg3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f527257d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f527257d;
        this.f527257d = i17 + 1;
        if (i17 == 0) {
            return kc5.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
