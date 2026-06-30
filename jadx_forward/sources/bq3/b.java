package bq3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105104d = 0;

    public b(bq3.c cVar, bq3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105104d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105104d;
        this.f105104d = i17 + 1;
        if (i17 == 0) {
            return bq3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
