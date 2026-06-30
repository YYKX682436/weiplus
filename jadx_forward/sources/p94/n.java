package p94;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434439d = 0;

    public n(p94.o oVar, p94.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434439d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434439d;
        this.f434439d = i17 + 1;
        if (i17 == 0) {
            return p34.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
