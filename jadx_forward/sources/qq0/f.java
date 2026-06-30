package qq0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447427d = 0;

    public f(qq0.g gVar, qq0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447427d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447427d;
        this.f447427d = i17 + 1;
        if (i17 == 0) {
            return qq0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
