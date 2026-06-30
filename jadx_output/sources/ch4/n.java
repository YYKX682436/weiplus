package ch4;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41519d = 0;

    public n(ch4.o oVar, ch4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41519d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41519d;
        this.f41519d = i17 + 1;
        if (i17 == 0) {
            return ch4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
