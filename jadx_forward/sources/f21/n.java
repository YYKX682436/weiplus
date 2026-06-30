package f21;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340471d = 0;

    public n(f21.o oVar, f21.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340471d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340471d;
        this.f340471d = i17 + 1;
        if (i17 == 0) {
            return f21.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
