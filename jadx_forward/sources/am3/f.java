package am3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90319d = 0;

    public f(am3.g gVar, am3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90319d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90319d;
        this.f90319d = i17 + 1;
        if (i17 == 0) {
            return am3.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
