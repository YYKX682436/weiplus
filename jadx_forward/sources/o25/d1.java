package o25;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424034d = 0;

    public d1(o25.e1 e1Var, o25.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424034d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424034d;
        this.f424034d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.app.p622xc5476f33.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
