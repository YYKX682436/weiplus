package a30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82471d = 0;

    public b(a30.c cVar, a30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82471d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82471d;
        this.f82471d = i17 + 1;
        if (i17 == 0) {
            return a30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
