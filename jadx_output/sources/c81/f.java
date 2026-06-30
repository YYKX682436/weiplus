package c81;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39661d = 0;

    public f(c81.g gVar, c81.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39661d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39661d;
        this.f39661d = i17 + 1;
        if (i17 == 0) {
            return c81.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
