package m40;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404953d = 0;

    public n(m40.o oVar, m40.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404953d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404953d;
        this.f404953d = i17 + 1;
        if (i17 == 0) {
            return c61.q7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
