package vz;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523064d = 0;

    public b(vz.c cVar, vz.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523064d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523064d;
        this.f523064d = i17 + 1;
        if (i17 == 0) {
            return uz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
