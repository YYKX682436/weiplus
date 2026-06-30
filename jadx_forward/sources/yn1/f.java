package yn1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f545194d = 0;

    public f(yn1.g gVar, yn1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f545194d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f545194d;
        this.f545194d = i17 + 1;
        if (i17 == 0) {
            return yn1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
