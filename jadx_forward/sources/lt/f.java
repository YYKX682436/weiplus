package lt;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402677d = 0;

    public f(lt.g gVar, lt.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402677d;
        this.f402677d = i17 + 1;
        if (i17 == 0) {
            return c63.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
