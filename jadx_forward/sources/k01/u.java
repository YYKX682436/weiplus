package k01;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384588d = 0;

    public u(k01.v vVar, k01.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384588d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384588d;
        this.f384588d = i17 + 1;
        if (i17 == 0) {
            return k01.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
