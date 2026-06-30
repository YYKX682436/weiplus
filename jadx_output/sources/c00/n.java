package c00;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37000d = 0;

    public n(c00.o oVar, c00.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37000d;
        this.f37000d = i17 + 1;
        if (i17 == 0) {
            return w20.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
