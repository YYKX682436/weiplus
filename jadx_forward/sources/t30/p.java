package t30;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496920d = 0;

    public p(t30.q qVar, t30.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496920d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496920d;
        this.f496920d = i17 + 1;
        if (i17 == 0) {
            return t30.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
