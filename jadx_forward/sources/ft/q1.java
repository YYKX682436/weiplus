package ft;

/* loaded from: classes6.dex */
public class q1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347954d = 0;

    public q1(ft.r1 r1Var, ft.p1 p1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347954d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347954d;
        this.f347954d = i17 + 1;
        if (i17 == 0) {
            return et.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
