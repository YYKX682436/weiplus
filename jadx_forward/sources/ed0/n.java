package ed0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332753d = 0;

    public n(ed0.o oVar, ed0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332753d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332753d;
        this.f332753d = i17 + 1;
        if (i17 == 0) {
            return dd0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
