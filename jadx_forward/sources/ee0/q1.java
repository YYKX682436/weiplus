package ee0;

/* loaded from: classes6.dex */
public class q1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333045d = 0;

    public q1(ee0.r1 r1Var, ee0.p1 p1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333045d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333045d;
        this.f333045d = i17 + 1;
        if (i17 == 0) {
            return ee0.c4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
