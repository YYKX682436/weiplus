package ee0;

/* loaded from: classes6.dex */
public class w2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333083d = 0;

    public w2(ee0.x2 x2Var, ee0.v2 v2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333083d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333083d;
        this.f333083d = i17 + 1;
        if (i17 == 0) {
            return ee0.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
