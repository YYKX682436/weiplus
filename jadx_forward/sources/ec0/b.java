package ec0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332462d = 0;

    public b(ec0.c cVar, ec0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332462d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332462d;
        this.f332462d = i17 + 1;
        if (i17 == 0) {
            return dc0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
