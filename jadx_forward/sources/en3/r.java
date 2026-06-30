package en3;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336854d = 0;

    public r(en3.s sVar, en3.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336854d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336854d;
        this.f336854d = i17 + 1;
        if (i17 == 0) {
            return en3.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
