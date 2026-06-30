package c00;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118547d = 0;

    public r(c00.s sVar, c00.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118547d;
        this.f118547d = i17 + 1;
        if (i17 == 0) {
            return b00.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
