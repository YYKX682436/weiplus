package az1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f16116d = 0;

    public b(az1.c cVar, az1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16116d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f16116d;
        this.f16116d = i17 + 1;
        if (i17 == 0) {
            return az1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
