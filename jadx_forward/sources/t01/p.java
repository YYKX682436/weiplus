package t01;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495943d = 0;

    public p(t01.q qVar, t01.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495943d;
        this.f495943d = i17 + 1;
        if (i17 == 0) {
            return t01.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
