package cv;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304022d = 0;

    public f(cv.g gVar, cv.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304022d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304022d;
        this.f304022d = i17 + 1;
        if (i17 == 0) {
            return bv.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
