package p90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434395d = 0;

    public f(p90.g gVar, p90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434395d;
        this.f434395d = i17 + 1;
        if (i17 == 0) {
            return oh3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
