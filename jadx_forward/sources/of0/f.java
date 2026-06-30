package of0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426398d = 0;

    public f(of0.g gVar, of0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426398d;
        this.f426398d = i17 + 1;
        if (i17 == 0) {
            return of0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
