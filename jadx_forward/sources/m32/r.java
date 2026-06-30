package m32;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404795d = 0;

    public r(m32.s sVar, m32.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404795d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404795d;
        this.f404795d = i17 + 1;
        if (i17 == 0) {
            return m32.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
