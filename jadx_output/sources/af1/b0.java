package af1;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4461d = 0;

    public b0(af1.c0 c0Var, af1.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4461d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4461d;
        this.f4461d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.ia.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
