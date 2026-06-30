package wp4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f529942d = 0;

    public f(wp4.g gVar, wp4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f529942d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f529942d;
        this.f529942d = i17 + 1;
        if (i17 == 0) {
            return wp4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
