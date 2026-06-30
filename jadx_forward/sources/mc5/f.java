package mc5;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407185d = 0;

    public f(mc5.g gVar, mc5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407185d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407185d;
        this.f407185d = i17 + 1;
        if (i17 == 0) {
            return mc5.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
