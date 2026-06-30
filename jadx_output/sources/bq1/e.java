package bq1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f23554d = 0;

    public e(bq1.f fVar, bq1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23554d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f23554d;
        this.f23554d = i17 + 1;
        if (i17 == 0) {
            return bq1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
