package ka0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387499d = 0;

    public b(ka0.c cVar, ka0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387499d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387499d;
        this.f387499d = i17 + 1;
        if (i17 == 0) {
            return ja0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
