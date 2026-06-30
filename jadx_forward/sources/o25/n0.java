package o25;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424097d = 0;

    public n0(o25.o0 o0Var, o25.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424097d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424097d;
        this.f424097d = i17 + 1;
        if (i17 == 0) {
            return o25.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
