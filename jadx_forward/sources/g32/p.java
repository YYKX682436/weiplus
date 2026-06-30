package g32;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349698d = 0;

    public p(g32.q qVar, g32.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349698d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349698d;
        this.f349698d = i17 + 1;
        if (i17 == 0) {
            return g32.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
