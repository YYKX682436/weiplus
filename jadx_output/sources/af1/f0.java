package af1;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4469d = 0;

    public f0(af1.g0 g0Var, af1.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4469d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4469d;
        this.f4469d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
