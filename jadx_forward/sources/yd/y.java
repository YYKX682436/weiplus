package yd;

/* loaded from: classes7.dex */
public abstract class y {
    public abstract void a();

    public yd.x b(java.lang.String str) {
        yd.e eVar = ((yd.b) this).f542450a;
        java.io.InputStream a17 = eVar.f542473b.x() != null ? eVar.f542473b.x().a(str) : null;
        if (a17 == null) {
            return null;
        }
        return new yd.x(this, q75.g.c(str), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, a17);
    }
}
