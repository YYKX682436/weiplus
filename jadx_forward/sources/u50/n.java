package u50;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506298d = 0;

    public n(u50.o oVar, u50.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506298d;
        this.f506298d = i17 + 1;
        if (i17 == 0) {
            return s50.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
