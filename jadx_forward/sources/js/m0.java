package js;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f382973d = 0;

    public m0(js.n0 n0Var, js.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f382973d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f382973d;
        this.f382973d = i17 + 1;
        if (i17 == 0) {
            return u61.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
