package bq3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105107d = 0;

    public f(bq3.g gVar, bq3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105107d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105107d;
        this.f105107d = i17 + 1;
        if (i17 == 0) {
            return bq3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
