package c34;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119722d = 0;

    public f(c34.g gVar, c34.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119722d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119722d;
        this.f119722d = i17 + 1;
        if (i17 == 0) {
            return c34.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
