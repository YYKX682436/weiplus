package nm1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420000d = 0;

    public b(nm1.c cVar, nm1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420000d;
        this.f420000d = i17 + 1;
        if (i17 == 0) {
            return mm1.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
