package fm;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345538d = 0;

    public p(fm.q qVar, fm.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345538d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345538d;
        this.f345538d = i17 + 1;
        if (i17 == 0) {
            return fm.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
