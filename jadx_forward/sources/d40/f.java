package d40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307891d = 0;

    public f(d40.g gVar, d40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307891d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307891d;
        this.f307891d = i17 + 1;
        if (i17 == 0) {
            return d40.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
