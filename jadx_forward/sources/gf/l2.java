package gf;

/* loaded from: classes5.dex */
public final class l2 implements e06.h {

    /* renamed from: d, reason: collision with root package name */
    public final gf.k2 f352654d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.k2 f352655e;

    public l2(gf.k2 k2Var, gf.k2 k2Var2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f352654d = k2Var;
        this.f352655e = k2Var2;
    }

    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        return e06.g.a(this, (gf.k2) comparable);
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return this.f352654d;
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return this.f352655e;
    }

    @Override // e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return ((gf.k2) h()).compareTo(g()) > 0;
    }
}
