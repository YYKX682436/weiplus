package au2;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f95597d = 0;

    public b(au2.c cVar, au2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f95597d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f95597d;
        this.f95597d = i17 + 1;
        if (i17 == 0) {
            return au2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
