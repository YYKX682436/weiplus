package am2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90163d = 0;

    public b(am2.c cVar, am2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90163d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90163d;
        this.f90163d = i17 + 1;
        if (i17 == 0) {
            return am2.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
