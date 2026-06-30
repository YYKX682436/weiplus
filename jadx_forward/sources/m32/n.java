package m32;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404792d = 0;

    public n(m32.o oVar, m32.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404792d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404792d;
        this.f404792d = i17 + 1;
        if (i17 == 0) {
            return m32.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
