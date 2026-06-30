package fa1;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342226d = 0;

    public p(fa1.q qVar, fa1.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342226d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342226d;
        this.f342226d = i17 + 1;
        if (i17 == 0) {
            return fa1.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
