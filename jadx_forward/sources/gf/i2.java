package gf;

/* loaded from: classes7.dex */
public final class i2 implements e06.h {

    /* renamed from: d, reason: collision with root package name */
    public final gf.h2 f352628d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.h2 f352629e;

    public i2(gf.h2 h2Var, gf.h2 h2Var2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f352628d = h2Var;
        this.f352629e = h2Var2;
    }

    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        return e06.g.a(this, (gf.h2) comparable);
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return this.f352628d;
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return this.f352629e;
    }

    @Override // e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return ((gf.h2) h()).compareTo(g()) > 0;
    }
}
