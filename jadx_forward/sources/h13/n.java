package h13;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359681d = 0;

    public n(h13.o oVar, h13.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359681d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359681d;
        this.f359681d = i17 + 1;
        if (i17 == 0) {
            return h13.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
